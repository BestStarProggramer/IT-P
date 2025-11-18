package lab4;

public class Exceptions_Array {

    public static void main(String[] args) {
        String[] array = {"1", "2", "abc", "4"};
        int sum = 0;
        int count = 0;

        try {
            for (int i = 0; i <= array.length; i++) {
                try {
                    int value = Integer.parseInt(array[i]);
                    sum += value;
                    count++;
                } catch (NumberFormatException e) {
                    System.out.println("Error: Element \"" + array[i] + "\" is not a valid number.");
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access an index outside the array bounds.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            if (count > 0) {
                System.out.println("Average is: " + (double) sum / count);
            } else {
                System.out.println("No valid numeric elements found.");
            }
        }
    }
}
