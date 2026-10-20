import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
class Solution {
    public int daysBetweenDates(String date1, String date2) {
        LocalDate d1=LocalDate.parse(date1);
        LocalDate d2=LocalDate.parse(date2);
        int daysBetween =Math.toIntExact(ChronoUnit.DAYS.between(d1,d2));
        return Math.abs(daysBetween);
        
    }
}