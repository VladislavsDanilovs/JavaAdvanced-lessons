package Lesson15_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example2_Regex2 {
    public static void main(String[] args) {
//        String s1 = "ABCD ABCE ABCFABCGABCH";
//        Pattern pattern1 = Pattern.compile("ABC"); //We cannot use pattern constructor, because its private, so we use method compile

//        String s1 = "OPKFBARVCA";
//        Pattern pattern1 = Pattern.compile("[ABC]"); //A or B or C

//        String s1 = "ABDOP";
//        Pattern pattern1 = Pattern.compile("AB[C-F]OP"); //find AB, then 1 from the letters C-F, then find OP

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc[e-g4-7]"); //find abc, then find 1 symbols e-g or 4-7

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc[^e-g4-7]"); //^ means find symbols that NOT INCLUDED in scope

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc(e|5)"); //fourth symbol that we need is e or 5;

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc."); //after abc any symbol counts

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("ch$"); // ^ without [] means expression at start matches with string? And $ means same but at the end.

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\d"); // one number from 0 - 9. Big D means, find all symbols exclude digits.

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\w"); // Matches with all symbols AND digits, exclude gap. [A-Zz-z0-9_]

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\w+"); //abcd, then abce, then last string

//        String s1 = "abcd!?abce====abc ++5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\W"); // all symbols that not included here: [A-Zz-z0-9_]. Like this: + - = ?

//        String s1 = "abcd!?abce====abc ++5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\W+"); // ?! then ==== then ++

//        String s1 = "goodbye abc Zaur house cinema abstract";
//        Pattern pattern1 = Pattern.compile("\\w{4}"); // first 4 symbols, good, Zaur, hous, cine, abst,ract

//        String s1 = "goodbye abc Zaur house cinema abstract";
//        Pattern pattern1 = Pattern.compile("\\w\\s+\\w"); // one symbol, one or multiple gaps, one symbol. s = [\t\n\r\f]

//        String s1 = "abcd abce3 abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\D{2,6}"); //abdc a then bce then abc then abcg then abch

//        String s1 = "ABCABABDA";
//        Pattern pattern1 = Pattern.compile("(AB){2,3}"); //repeating from 2 to 3 times. position:3 ABAB

//        String s1 = "DABCDABABDABABABABD";
//        Pattern pattern1 = Pattern.compile("D(AB){2,}"); //we're finding DABAB or DABAB.AB.AB.....

//        String s1 = "DABCDABA";
//        Pattern pattern1 = Pattern.compile("D(AB)*"); //D followed by 0 or more iterations of repeating expression AB. + means the same but starting at 1 or more.

//        String s1 = "abcd abce abcfabcgabch";
//        Pattern pattern1 = Pattern.compile("\\Aabcd"); //starting of the string is abcd?

//        String s1 = "abcd abce abcfabcgabch";
//        Pattern pattern1 = Pattern.compile("bch\\Z"); //ending of the string is abcd?

        String s1 = "abcd abce abcfabcgabch";
        Pattern pattern1 = Pattern.compile("[abcd][efh3-8]"); //first symbol from [] and second from another []


        Matcher matcher = pattern1.matcher(s1);

        while(matcher.find()){
            System.out.println("Position: "+matcher.start()+"   "+matcher.group());
        }
    }
}
