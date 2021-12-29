package Java_Advanced.Lesson3_Generics.Lesson7_Practice_Example;

public abstract class Participants {
    private String name;
    private int age;

    Participants(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}
