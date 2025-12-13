package lab7;

public class ArraySumMultiThread {

    static class SumTask implements Runnable {

        private final int[] array;
        private final int start;
        private final int end;
        private long result;

        public SumTask(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            long sum = 0;
            for (int i = start; i < end; i++) {
                sum += array[i];
            }
            result = sum;
        }

        public long getResult() {
            return result;
        }
    }

    public static void main(String[] args) throws InterruptedException {

        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        int mid = array.length / 2;

        SumTask task1 = new SumTask(array, 0, mid);
        SumTask task2 = new SumTask(array, mid, array.length);

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        long totalSum = task1.getResult() + task2.getResult();

        System.out.println("Sum: " + totalSum);
    }
}
