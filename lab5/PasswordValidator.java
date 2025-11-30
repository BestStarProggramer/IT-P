package lab5;

import java.util.regex.*;
import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*\\d)[A-Za-z0-9]{8,16}$");

            Matcher matcher = pattern.matcher(password);

            if (matcher.matches()) {
                System.out.println("Password is valid.");
            } else {
                System.out.println("Password is not valid.");
            }

        } catch (PatternSyntaxException e) {
            System.out.println("Regex error: " + e.getDescription());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}
