package Lesson16_Another_Important_Topics.Enums;

public class Example2_Enum2 {
    public static void main(String[] args) {
        Today t1 = new Today(WeekDays.SUNDAY);
        t1.daysInfo();
    }
}

enum WeekDays {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

class Today {

    WeekDays weekDay;

    public Today(WeekDays weekDay) {
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
    }
}