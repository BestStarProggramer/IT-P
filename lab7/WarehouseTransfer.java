package lab7;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class WarehouseTransfer {

    static class TransferTask extends RecursiveAction {

        private static final int MAX_WEIGHT = 150;
        private final List<Integer> items;
        private final int start;
        private final int end;

        public TransferTask(List<Integer> items, int start, int end) {
            this.items = items;
            this.start = start;
            this.end = end;
        }

        @Override
        protected void compute() {
            int totalWeight = 0;
            int i = start;
            while (i < end && totalWeight + items.get(i) <= MAX_WEIGHT) {
                totalWeight += items.get(i);
                i++;
            }

            int transferredCount = i - start;

            if (transferredCount == 0) {
                transferredCount = 1;
            }

            System.out.println("Loaders transferred " + transferredCount + " items weighing " + totalWeight + " kg.");

            if (start + transferredCount < end) {
                TransferTask nextTask = new TransferTask(items, start + transferredCount, end);
                nextTask.fork();
                nextTask.join();
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> warehouse = List.of(30, 20, 50, 60, 40, 10, 80, 70, 20, 10);

        ForkJoinPool pool = new ForkJoinPool(3);

        TransferTask task = new TransferTask(warehouse, 0, warehouse.size());

        pool.invoke(task);

        pool.shutdown();
    }
}
