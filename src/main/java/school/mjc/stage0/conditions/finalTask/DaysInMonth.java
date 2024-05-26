package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (month < 1 || month > 12) {
            System.out.println("invalid date");
        } else if (month == 2) {
            System.out.println(year % 4 != 0 || year % 100 == 0 && year % 400 != 0 ? 28 : 29);
        } else if (month < 8 && month % 2 == 1) {
            System.out.println(31);
        } else if (month < 8 && month % 2 == 0) {
            System.out.println(30);
        } else if (month > 7 && month % 2 == 0) {
            System.out.println(31);
        } else if (month > 7 && month % 2 == 1) {
            System.out.println(30);
        }
    }
}