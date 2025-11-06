package lab4;

public class Exceptions_Files {
    public static void main(String[] args) {
        try {
            java.io.FileInputStream in = new java.io.FileInputStream("file1.txt");
            java.io.FileOutputStream out = new java.io.FileOutputStream("file2.txt");
            
            try {
            byte[] buffer = new byte[1024];
            int length;
            
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
            
            System.out.println("File copied successfully!");
            
            } catch (java.io.IOException e) {
            System.err.println("Error while reading/writing file: " + e.getMessage());
            } finally {
            try {
                in.close();
                out.close();
            } catch (java.io.IOException e) {
                System.err.println("Error while closing files: " + e.getMessage());
            }
            }
            
        } catch (java.io.FileNotFoundException e) {
            System.err.println("Error opening file: " + e.getMessage());
        }
    }
}
