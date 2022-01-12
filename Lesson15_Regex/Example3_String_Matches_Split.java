package Lesson15_Regex;

import java.util.Arrays;

public class Example3_String_Matches_Split {
    public static void main(String[] args) {
        String s1
                = "Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, Flat 48," +
                "email: vivanov@mail.ru, Postcode: AA99, Phone number: +123456789;"
                + "Petrova Mariya, Ukraine, Kiyev, Lomonosov street, 33, flat 18," +
                "email: masha@yandex.ru, Postcode: UKR54, Phone Number: +987654321;"
                + "Chuck Norris, USA, Hollywood, All stars street, 87, Flat 21," +
                "email: chuck@gmail.com, Postcode: USA23, Phone Number: +136478952.";
        String s2 = "chuck@gmail.com";

        boolean result = s2.matches("\\w+@\\w+\\.(com|ru)"); //We can check only 1 email if there will be more, method will return false;
        System.out.println(result);

        String[] array1 = s1.split(" "); //Split string by inserting comma
        System.out.println(Arrays.toString(array1));
    }
}
