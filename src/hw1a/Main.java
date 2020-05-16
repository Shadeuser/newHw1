package hw1a;

public class Main {
    public static void main(String[] args) {
        returnWorkHours(DayOfWeek.FRIDAY);
    }

    public static void returnWorkHours(DayOfWeek inDay) {
        int outDay =  DayOfWeek.SATURDAY.compareTo(inDay);
        if (outDay<=0) {
            System.out.println("Сегодня выходной !!!");
            return;
        }

        System.out.println("До конца рабочей недели осталось " + outDay*24 + " дней/дня");



    }

}
