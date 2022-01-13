package Lesson16_Another_Important_Topics.Enums;

import java.util.Arrays;

public class Example3_Enum3 {
    public static void main(String[] args) {
        Today2 t1 = new Today2(WeekDays2.SUNDAY);
        t1.daysInfo();
        System.out.println(t1.weekDay);

        WeekDays2 w1 = WeekDays2.FRIDAY;
        WeekDays2 w2 = WeekDays2.FRIDAY;
        WeekDays2 w3 = WeekDays2.MONDAY;
        System.out.println(w1 == w2); //true

//        System.out.println(WeekDays3.FRIDAY == WeekDays2.FRIDAY); // 2 different types
        System.out.println(WeekDays3.FRIDAY.equals(WeekDays2.FRIDAY)); // false

        WeekDays2 w15 = WeekDays2.valueOf("MONDAY"); //String should be written as existing enum, without mistakes
        System.out.println(w15); //output will be MONDAY

        WeekDays2 [] array1 = WeekDays2.values();
        System.out.println(Arrays.toString(array1)); // output: [MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY]
    }
}

enum WeekDays2 {
    MONDAY("bad"),
    TUESDAY("not bad"),
    WEDNESDAY("so"),
    THURSDAY("good"),
    FRIDAY("excellent"),
    SATURDAY("perfect"),
    SUNDAY("good");

    private String mood;
    private WeekDays2(String mood){ //This constructor will be private even if we will not declare it as private
        this.mood = mood;
    }
//    private WeekDays2(){
//    }
    public String getMood(){
        return mood;
    }
}

enum WeekDays3 {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

}

class Today2 {

    WeekDays2 weekDay;

    public Today2(WeekDays2 weekDay) {
        this.weekDay = weekDay;
    }

    void daysInfo() {
        switch (weekDay) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> {
                System.out.println("Go to the work!");
            }
            case SATURDAY, SUNDAY -> {
                System.out.println("You can take a break");
            }
        }
        System.out.println("Mood at this day: "+weekDay.getMood());
    }
}