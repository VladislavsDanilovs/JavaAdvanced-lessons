package Java_Advanced.Lesson3_Generics.Lesson2_Parameterized_class;

public class Parameterized_class {
    
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("Hello");
        Info<Integer> info2 = new Info<>(241242141);
        System.out.println(info1);
        System.out.println(info2);
        String s = info1.getValue();
    }
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

