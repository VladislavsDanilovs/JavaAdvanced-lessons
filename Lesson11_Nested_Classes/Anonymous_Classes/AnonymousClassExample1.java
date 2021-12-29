package Lesson11_Nested_Classes.Anonymous_Classes;

public class AnonymousClassExample1 {
    public static void main(String[] args) {
        Math m = new Math() {
            int c = 10;
            void abc(){

            }


        @Override
            public  int doOperation(int a, int b){
            return  a+ b;
        }
        };

        Math m2 = new Math() {
            @Override
            public  int doOperation(int a, int b){
                return  a * b;
            }
        };


        System.out.println(m.doOperation(3,6));
        System.out.println(m2.doOperation(3,6));
    }
}

class Math {
    int doOperation(int a, int b) {
        return a/b;
    }

}
