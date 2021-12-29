package Java_Advanced.Lesson6_LinkedList.Lesson6_LinkedIterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//palindrom

public class Test1 {
    public static void main(String[] args) {
        String s = "Hello";
        // char[]ch1 = s.toCharArray();
        List<Character> list1 = new LinkedList<>();
        for(char ch: s.toCharArray()){
            list1.add(ch);
        }

        ListIterator<Character> It1 = list1.listIterator(); //s pervogo elementa
        ListIterator<Character> It2 = list1.listIterator(list1.size()); //s konca idem
        boolean isPalindrome = true;
        while (It1.hasNext() && It2.hasPrevious()) {
            if(It1.next() != It2.previous()){
                isPalindrome = false;
                break;
            }
        } if(isPalindrome){
            System.out.println("word is palindrome");
        } else{
            System.out.println("word isn't palindrome");

        }
   
   
   
   
    }
}
