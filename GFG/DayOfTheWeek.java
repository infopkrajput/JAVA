public class DayOfTheWeek {
    static String getDayOfWeek(int d, int m, int y) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        y = y - 1;
        int leapysDays = y / 400 + y / 4 - y / 100;
        int allDays = y * 365 + leapysDays;
        y = y + 1;
        daysInMonth[1] = (y % 400 == 0 || y % 4 == 0 && y % 100 != 0)?29:28;
        for (int i = 0; i < m - 1; i++) {
            allDays += daysInMonth[i];
        }
        allDays += d;
        int dayOfWeek = allDays % 7;
        if (dayOfWeek == 0) {
            return "Sunday";
        } else if (dayOfWeek == 1) {
            return "Monday";
        } else if (dayOfWeek == 2) {
            return "Tuesday";
        } else if (dayOfWeek == 3) {
            return "Wednesday";
        } else if (dayOfWeek == 4) {
            return "Thursday";
        } else if (dayOfWeek == 5) {
            return "Friday";
        } else {
            return "Saturday";
        }
    }
    public static void main(String[] args) {
        int day = 20;
        int month = 4;
        int year = 2033;
        System.out.println(getDayOfWeek(day, month, year));
    }
}
