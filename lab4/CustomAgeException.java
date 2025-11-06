package lab4;

public class CustomAgeException {
    public static void main(String[] args) {
        String age_raw = "0"; 

        try {
            int age = Integer.parseInt(age_raw);
            if (age <= 0 || age > 120 || age != (int) age) {
                throw new AgeException("type a valid age");
            } else {
                System.out.println("Age is valid.");
            }
        } catch (AgeException e) {
            Logger.log(e);
            System.err.println("Custom Exception Caught: " + e.getMessage());
        } catch (NumberFormatException e) {
            Logger.log(e);
            System.err.println("Invalid input format: " + e.getMessage());
    }
}
}

class AgeException extends Exception {
    public AgeException(String message) {
        super(message); 
    }
}

class Logger {

    private static final String LOG_FILE = "errors.log";

    public static void log(Exception e) {
        try (java.io.FileWriter fw = new java.io.FileWriter(LOG_FILE, true)) {
            fw.write(e.toString() + "\n");
        } catch (java.io.IOException ioEx) {
            System.err.println("Log error: " + ioEx.getMessage());
        }
    }
}
