package lab6;

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class SalesTracker {

    private TreeMap<String, Integer> sales = new TreeMap<>();

    public void addSale(String product) {
        sales.put(product, sales.getOrDefault(product, 0) + 1);
    }

    public void printSales() {
        System.out.println("Products sold:");
        for (Map.Entry<String, Integer> entry : sales.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public int getTotalSales() {
        int total = 0;
        for (int count : sales.values()) {
            total += count;
        }
        return total;
    }

    public String getTopProduct() {
        String topProduct = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : sales.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                topProduct = entry.getKey();
            }
        }
        return topProduct;
    }

    public static void main(String[] args) {
        SalesTracker tracker = new SalesTracker();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Type product names to add sales. Press Enter on an empty line to finish");

            while (true) {
                System.out.print("Product: ");
                String product = scanner.nextLine().trim();
                if (product.isEmpty()) {
                    break;
                }

                tracker.addSale(product);
            }

            System.out.println();
            tracker.printSales();
            System.out.println("Total sales: " + tracker.getTotalSales());
            System.out.println("Top product: " + tracker.getTopProduct());
        }
    }
}
