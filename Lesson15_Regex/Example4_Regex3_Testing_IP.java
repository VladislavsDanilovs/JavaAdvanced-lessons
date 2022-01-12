package Lesson15_Regex;

import java.util.regex.Pattern;

public class Example4_Regex3_Testing_IP {

    public static void main(String[] args) {
        //0-255.0-255.0-255.0-255 IP address that we get should look like this
        String ip1 = "255.38.192.99";
        String ip2 = "182.262.91.05";

        Example4_Regex3_Testing_IP r1 = new Example4_Regex3_Testing_IP();
        r1.checkIp(ip1);
        r1.checkIp(ip2);

    }

    void checkIp(String ip){
        String regex1 = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}"+
                "(25[0-5]|2[0-4]\\d |[01]?\\d?\\d)";
        // 25[0-5]      |     2[0-4]\d     |     [01]?\d?\d     (\.){3}
        // 250-255      |     200-249              0-199        dot, then repeat this 3 times
        // after + doing the same, but without dot, and last digit is in range 0-255

        System.out.println(ip + " is OK? "+ Pattern.matches(regex1, ip));
    }
}
