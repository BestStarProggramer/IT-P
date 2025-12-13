package lab7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MatrixMaxExecutor {

    static class MaxTask implements Runnable {

        private final int[][] matrix;
        private final int startRow;
        private final int endRow;
        private final int[] results;
        private final int index;

        public MaxTask(int[][] matrix, int startRow, int endRow, int[] results, int index) {
            this.matrix = matrix;
            this.startRow = startRow;
            this.endRow = endRow;
            this.results = results;
            this.index = index;
        }

        @Override
        public void run() {
            int max = Integer.MIN_VALUE;
            for (int i = startRow; i < endRow; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] > max) {
                        max = matrix[i][j];
                    }
                }
            }
            results[index] = max;
        }
    }

    public static void main(String[] args) throws InterruptedException {

        int rows = 8;
        int cols = 6;
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = i * cols + j;
            }
        }

        int numberOfThreads = 4;
        int rowsPerTask = rows / numberOfThreads;

        ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);

        int[] results = new int[numberOfThreads];
        for (int i = 0; i < numberOfThreads; i++) {
            int startRow = i * rowsPerTask;
            int endRow = (i == numberOfThreads - 1) ? rows : startRow + rowsPerTask;

            executor.execute(new MaxTask(matrix, startRow, endRow, results, i));
        }

        executor.shutdown();
        while (!executor.isTerminated()) {
            Thread.sleep(50);
        }

        int globalMax = Integer.MIN_VALUE;
        for (int localMax : results) {
            if (localMax > globalMax) {
                globalMax = localMax;
            }
        }

        System.out.println("Max: " + globalMax);
    }
}
