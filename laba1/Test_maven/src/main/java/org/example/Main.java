package org.example;
import org.slf4j.*;
import java.util.regex.*;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

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

        logger.info(result.toString());


        try {
            User user = new User("Dmitriy", 20);

            String json = JsonService.toJson(user);
            logger.info("JSON: {}", json);

            User restored = JsonService.fromJson(json, User.class);
            logger.info("Restored name: {}", restored.getName());

        } catch (Exception e) {
            logger.error("JSON processing failed", e);
        }
// check spotbugs plugin
        String s = null;
        s.length();
    }
}
