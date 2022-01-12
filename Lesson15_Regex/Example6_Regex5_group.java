package Lesson15_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example6_Regex5_group {
    public static void main(String[] args) {
        String myString = "12345678912392920325899;" +
                "81482482183412921124124;" +
                "87124712712731920927375";
        // 1234 5678 9123 9292 03/25 (899) Bank card number. We want to reorder 03/25 date, at the first place of the string.

        Pattern pattern = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher = pattern.matcher(myString);
//        String myNewString = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7)"); //$ - number of group in  this case
//        System.out.println(myNewString);

        while (matcher.find()){
            System.out.println(matcher.group(7));
        }
    }
}
