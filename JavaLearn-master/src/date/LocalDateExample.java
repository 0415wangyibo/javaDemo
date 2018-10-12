package date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Date;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/7/9 11:04
 * Modified By:
 * Description:
 */
public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate hundredDay2014 = LocalDate.ofYearDay(2018, 200);
        System.out.println(hundredDay2014);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime1 = LocalDateTime.now();
        System.out.println(dateTime1);

        LocalDateTime localDateTime = LocalDateTime.ofEpochSecond(1_0000, 100_0000, ZoneOffset.UTC);
        System.out.println(localDateTime);

        Instant instantTime = Instant.now();
        int temp = instantTime.get(ChronoField.DAY_OF_WEEK);
        System.out.println(instantTime + "  " + temp);

        //Format examples
        LocalDate date = LocalDate.now();
        //default format
        System.out.println("Default format of LocalDate=" + date);
        //specific format
        System.out.println(date.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));
        System.out.println(date.format(DateTimeFormatter.BASIC_ISO_DATE));

        LocalDateTime dateTime = LocalDateTime.now();
        //default format
        System.out.println("Default format of LocalDateTime=" + dateTime);
        //specific format
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));
        System.out.println(dateTime.format(DateTimeFormatter.BASIC_ISO_DATE));

        Instant timestamp = Instant.now();
        //default format
        System.out.println("Default format of Instant=" + timestamp);


        Long milliSecond = LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli();
        System.out.println(milliSecond + "+" + new Date());
    }
}
