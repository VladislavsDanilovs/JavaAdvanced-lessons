package Lesson11_Nested_Classes.Local_Inner_Class;

public class LocalInnerExample2 {
    public static void main(String[] args) {
        class Addition implements Math2{

            @Override
            public int doOperation(int a, int b) {
                return a+b;
            }
        }
        Addition add1 = new Addition();

        System.out.println(add1.doOperation(5, 3));
    }
}

interface Math2{
    int doOperation(int a, int b);
}
