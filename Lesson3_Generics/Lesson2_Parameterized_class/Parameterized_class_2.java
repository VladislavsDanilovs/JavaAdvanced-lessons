package Java_Advanced.Lesson3_Generics.Lesson2_Parameterized_class;

public class Parameterized_class_2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Hello", 1244);

        System.out.println(pair1.getFirstValue());
        System.out.println(pair1.getSecondtValue());
   
        Pair<Integer, Double> pair2 = new Pair<>(777, 777.1);

        System.out.println(pair2.getFirstValue());
        System.out.println(pair2.getSecondtValue());
   
   
    }


}

class Pair<V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue(){
        return value1;
    }
    public V2 getSecondtValue(){
        return value2;
    }
}

class OtherPair<V1> {
    private V1 value1;
    private V1 value2;

    public <V1> V1 abc (V1 val) {
        return val;
    }

    public OtherPair(V1 value1, V1 value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue(){
        return value1;
    }

}
