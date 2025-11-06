package lab4;

public class Exceptions_Array {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        try {
            for (int i = 0; i <= array.length; i++) {
                sum += array[i];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access an index outside the array bounds.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Final sum is: " + sum);
        }
    }
}
