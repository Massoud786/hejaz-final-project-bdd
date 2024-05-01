package project.bdd.utility;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
public class DateGenerator {
    public static String getCurrentDate(){
        Date currentDate = new Date();
        SimpleDateFormat format = new SimpleDateFormat("MMMM dd, yyyy");
        return format.format(currentDate);

    }
    public static String getADayAfterCurrentDate(){
        LocalDate currentDate = LocalDate.now();
        LocalDate dayAfterCurrentDate = currentDate.plusDays(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        return dayAfterCurrentDate.format(formatter);
    }



}
