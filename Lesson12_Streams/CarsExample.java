package Lesson12_Streams;

import java.util.ArrayList;
import java.util.List;

public class CarsExample {
    @Override
    public String toString() {
        return "CarsExample{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", carHolders=" + carHolders +
                '}';
    }

    public static void main(String[] args) {

        People entity1 = new People("Maxim");
        People entity2 = new People("Pavlik");
        People entity3 = new People("PatrikStar");

        CarsExample car1 = new CarsExample("huracan", "green");
        CarsExample car2 = new CarsExample("ferrari sf90", "red");
        CarsExample car3 = new CarsExample("nissan gtr", "blue");

        car1.setPeople(entity1);
        car2.setPeople(entity2);
        car3.setPeople(entity3);




//        facultyList.stream().flatMap(faculty -> faculty.getStudentsFaculty().stream())
//                .forEach(e-> System.out.println(e.getName()));
//



    }

    String model;
    String color;
    List<People> carHolders;


    public void setPeople(People p){
        carHolders.add(p);

        System.out.println(getCarHolders());

    }

    CarsExample(String model, String color){
        this.model = model;
        this.color = color;
        carHolders = new ArrayList<>();

    }

        public List<People> getCarHolders(){
        return carHolders;
    }
}

class People {

    String name;

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                '}';
    }

    People(String name){
        this.name = name;
    }

}
