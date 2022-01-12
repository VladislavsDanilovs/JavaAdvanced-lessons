package Lesson15_Regex;

public class Example5_Regex4_replaceAll {
    public static void main(String[] args) {
        String s1 = "Hello, my friend!     How     are    you?";
        System.out.println(s1);
//        s1 = s1.replace("you", "SQL");
//        s1 = s1.replaceAll(" {2,}", " ");
//        s1 = s1.replaceAll("\\by\\w+", "4444");
        s1 = s1.replaceFirst("\\bH\\w+", "4444"); //replace only first coincidence
        System.out.println(s1);
    }
}
