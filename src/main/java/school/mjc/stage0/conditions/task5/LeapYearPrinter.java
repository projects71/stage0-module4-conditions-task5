package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        boolean b = (year % 4 == 0 && year % 100 != 0 )|| year % 400 == 0;
        int r = b ? 1 : 0;

        switch (r) {
            case 1:
                System.out.println("leap");
                break;
            default:
                System.out.println("not leap");
                break;
        }
    }
}
