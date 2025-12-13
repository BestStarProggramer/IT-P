package lab5;

import java.util.regex.*;

public class IPAddressValidator {

    public static void main(String[] args) {
        String[] testIPs = {
            "192.168.1.1",
            "255.255.255.255",
            "0.0.0.0",
            "256.100.50.0",
            "192.168.1",
            "192.168.01.1",
            "asdasdasfff"
        };

        String ipPattern = "^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$";

        Pattern pattern = null;
        try {
            pattern = Pattern.compile(ipPattern);
        } catch (PatternSyntaxException e) {
            System.out.println("Regex error: " + e.getDescription());
            return;
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
            return;
        }

        for (String ip : testIPs) {
            Matcher matcher = pattern.matcher(ip);
            if (matcher.matches()) {
                System.out.println(ip + " is a valid IP address.");
            } else {
                System.out.println(ip + " is NOT a valid IP address.");
            }
        }
    }
}
