/* 
 https://leetcode.com/problems/day-of-the-year/description/
 */

package leetCode;
public class DayoftheYear1154 {
    public static int dayOfYear(String date) {
        int[] count = {31,28,31,30,31,30,31,31,30,31,30,31};
        String[] datePart = date.split("-");
        int year = Integer.parseInt(datePart[0]);
        int month = Integer.parseInt(datePart[1]);
        int day = Integer.parseInt(datePart[2]);
        int totalDays = 0;
        if(year %400==0 || year %100!=0 && year %4==0)
        {
            count[1] = 29;
        }
        for(int i = 0; i < month-1; i++)
        {
            totalDays += count[i];
        }
        totalDays +=day;
        return totalDays;
    }
    public static void main(String[] args) {
        String date = "2019-02-10";
        System.out.println(dayOfYear(date));
    }
}
