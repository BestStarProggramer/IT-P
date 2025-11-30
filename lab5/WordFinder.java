package lab5;

import java.util.regex.*;

public class WordFinder {

    public static void main(String[] args) {
        String text = "Apple apricot banana Avocado berry Almond";
        char targetLetter = 'A';

        String patternString = "\\b" + targetLetter + "\\w*\\b";

        Pattern pattern = null;
        try {
            pattern = Pattern.compile(patternString);
        } catch (PatternSyntaxException e) {
            System.out.println("Syntax error: " + e.getDescription());
            return;
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
            return;
        }

        Matcher matcher = pattern.matcher(text);
        boolean found = false;

        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        if (!found) {
            System.out.println("No words starting with letter '" + targetLetter + "'found");
        }
    }
}
