package Lesson16_Another_Important_Topics.Scanner;

import java.util.Scanner;

public class Example1_Scanner1 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insert the number");
//        int i = scanner.nextInt();
//        System.out.println("Inserted number is: "+i);

//        System.out.println("Insert two numbers");
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        System.out.println("x/y = "+x/y);
//        System.out.println("x%y = "+x%y);

//        System.out.println("Write some strings");
//        String s = scanner.nextLine();
//        System.out.println("You wrote: "+s);

//        System.out.println("Insert floating numbers ");
//        double d = scanner.nextDouble();
//        System.out.println("Inserted number is: "+d);

        Scanner scanner = new Scanner("Hello my friend!\n How its going?\nAre you alright?");
//        String s = scanner.nextLine();
//        System.out.println(s);
//        System.out.println(scanner.nextLine());
//        System.out.println(scanner.nextLine());
//        while(scanner.hasNextLine()){
//            System.out.println(scanner.nextLine());
//        }
        System.out.println(scanner.next().charAt(2));
        scanner.close();
    }
}
