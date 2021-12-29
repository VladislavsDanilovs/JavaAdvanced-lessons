package Lesson11_Nested_Classes.Static_Nested;

public class Car {
    String color;
    int doorCount;
    Engine engine;
   private static int a;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    void method(){
        System.out.println(Engine.countOfObjects);
        Engine e = new Engine(250);
        System.out.println(e.HP);
    }

    @Override
    public String toString() {
        return "My Car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine extends Z{
        private int HP;
        static int countOfObjects;

        public Engine(int HP) {
            System.out.println(a);
//            System.out.println(doorCount);
            this.HP = HP;
        }

        @Override
        public String toString() {
            return "My Engine: {" +
                    "HP=" + HP +
                    '}';
        }
    }
}

class Test{
    public static void main(String[] args) {

        Car.Engine e1 = new Car.Engine(255);
        System.out.println(e1);
        Car c1 = new Car("Black", 4, e1);
        System.out.println(c1);

    }
}

class Z{}