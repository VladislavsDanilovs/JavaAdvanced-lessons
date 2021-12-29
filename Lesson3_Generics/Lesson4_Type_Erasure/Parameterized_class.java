package Java_Advanced.Lesson3_Generics.Lesson4_Type_Erasure;

public class Parameterized_class {
    
    public static void main(String[] args) {
        // Info<String> info1 = new Info<>("privet");
        // Info<Integer> info2 = new Info<>(241242141);
        // System.out.println(info1);
        // System.out.println(info2);
        // String s = info1.getValue();
    }
    // public void abc(Info<String>info) {
    //     String s = info.getValue();
    // }

    // public void abc(Info<Integer>info) {
    //     Integer i = info.getValue();

    //     //abc (info info) both methods for JVM looks similar!
        
    // }
}
    class Info <T> {
        private T value;
        public Info(T value) {
            this.value=value;
        }
        public String toString(){
            return "{["+value+"]}";
        }

        public T getValue() {
            return value;
        }
    }

    // class Parent{
    //      public void abc(Info<String>info) {
    //     String s = info.getValue();
    // }
    // }

//     class Child extends Parent {
//         public void abc(Info<Integer>info) {
//             Integer i = info.getValue();
//    }
   

