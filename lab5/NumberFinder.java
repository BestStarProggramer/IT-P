package lab5;

import java.util.regex.*;

public class NumberFinder {

    public static void main(String[] args) {
        Pattern pattern = null;
        try {
            String text = "The price of the product is $19.99 and the discount is 20%, and my iq is 99";

            // Pattern pattern = Pattern.compile("(");
            pattern = Pattern.compile("\\d+(\\.\\d+)?");
            Matcher matcher = pattern.matcher(text);

            boolean found = false;

            while (matcher.find()) {
                System.out.println(matcher.group());
                found = true;
            }

            if (!found) {
                System.out.println("No numbers found");
            }

        } catch (PatternSyntaxException e) {
            System.out.println("Error in syntax: " + e.getDescription());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
