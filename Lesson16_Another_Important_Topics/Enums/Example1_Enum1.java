package Lesson16_Another_Important_Topics.Enums;

public class Example1_Enum1 {
    void dayOfWeek(String day){
        System.out.println("Today is " + day);
    }

    public static void main(String[] args) {
        Example1_Enum1 e1 = new Example1_Enum1();
        e1.dayOfWeek("Monday"); //But here we can write anything that we want, so program does not work as supposed to
    }
}
