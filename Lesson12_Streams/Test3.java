package Lesson12_Streams;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] array1 = {5, 9, 3, 8, 1};
        System.out.println();


        Arrays.stream(array1).forEach(Utils::myMethod);
        //same output will be bellow:
        Arrays.stream(array1).forEach(el->Utils.myMethod(el));
    }
}

 class Utils {
    public static void myMethod(int a){
       a = a+5;
        System.out.println("Elements = "+a);
     }
 }