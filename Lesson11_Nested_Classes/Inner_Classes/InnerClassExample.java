package Lesson11_Nested_Classes.Inner_Classes;

public class InnerClassExample {
}


class Car {
    String color;
    int doorCount;
    Engine engine;


    public Car(String color, int doorCount) {
        Engine e = new Engine(200);
        System.out.println(e.HP);
        this.color = color;
        this.doorCount = doorCount;
//        this.engine = this.new Engine(HP);
        }

        public void setEngine(Engine engine) {
        this.engine = engine;
    }


    @Override
    public String toString() {
        return "My Car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public class Engine{
        private int HP;

        public Engine(int HP) {
            this.HP = HP;
            System.out.println(doorCount);
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
    Car car = new Car("Black", 3);


        Car.Engine engine = car.new Engine(150);
        car.setEngine(engine);
        System.out.println(engine);
        System.out.println(car);

        Car.Engine engine3 = new Car("yellow", 4).new Engine(200);


    }
}
