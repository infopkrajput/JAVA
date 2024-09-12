public class DayOfTheWeek {
    public static String dayOfTheWeek(int day, int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        year = year - 1;
        int leapYearsDays = year / 400 + year / 4 - year / 100;
        int allDays = year * 365 + leapYearsDays;
        year = year + 1;
        daysInMonth[1] = (year % 400 == 0 || year % 4 == 0 && year % 100 != 0)?29:28;
        for (int i = 0; i < month - 1; i++) {
            allDays += daysInMonth[i];
        }
        allDays += day;
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
        System.out.println(dayOfTheWeek(day, month, year)); // Expected output: "Friday"
    }
}
