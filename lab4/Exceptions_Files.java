package lab4;

public class Exceptions_Files {

    public static void main(String[] args) {

        java.io.FileInputStream in = null;
        java.io.FileOutputStream out = null;

        try {
            in = new java.io.FileInputStream("file1.txt");

            // in = new java.io.FileInputStream("fileasdasdasdasdasddas1.txt");
            out = new java.io.FileOutputStream("file2.txt");

            try {
                byte[] buffer = new byte[1];
                int length;

                while ((length = in.read(buffer)) > 0) {
                    out.write(buffer, 0, length);

                    out.close();
                }
                System.out.println("File copied successfully!");

            } catch (java.io.IOException e) {
                System.err.println("Error while reading/writing file: " + e.getMessage());
            }

        } catch (java.io.FileNotFoundException e) {
            System.err.println("Error opening file: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
        } finally {

            if (in != null) {
                try {
                    in.close();
                } catch (java.io.IOException e) {
                    System.err.println("Error while closing input file: " + e.getMessage());
                }
            }

            if (out != null) {
                try {
                    out.close();
                } catch (java.io.IOException e) {
                    System.err.println("Error while closing output file: " + e.getMessage());
                }
            }
        }
    }
}
