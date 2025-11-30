package lab5;

import java.util.regex.*;

public class CapitalAfterLower {

    public static void main(String[] args) {
        String text = "aB cD Ef gH iJ Kl mN oP qR sT Uv wX yZ";

        Pattern pattern = Pattern.compile("[a-z][A-Z]");
        Matcher matcher = pattern.matcher(text);

        StringBuffer result = new StringBuffer();

        while (matcher.find()) {
            String match = matcher.group();

            matcher.appendReplacement(result, "!" + match + "!");
        }
        matcher.appendTail(result);

        System.out.println(result.toString());
    }
}
