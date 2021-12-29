package Lesson8_Map;
import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<Double,Student> ht = new Hashtable<>();

        Student st5 = new Student("D", "Shaurm", 2 );
        Student st6 = new Student("A", "urm", 2 );
        Student st7 = new Student("C", "bras", 2 );

        ht.put(4.8, st5);
        ht.put(9.3, st6);
        ht.put(2.5, st7);

        System.out.println(ht);
    }
}
