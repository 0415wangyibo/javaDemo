package date;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static com.google.gson.internal.bind.util.ISO8601Utils.format;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/7/9 11:30
 * Modified By:
 * Description:
 */
public class TimeUtil {
    public static void main(String[] args) {
        System.out.println(Calendar.getInstance().get(Calendar.DAY_OF_WEEK));


//        Instant instantTime = Instant.now();
//        int temp = instantTime.get(ChronoField.DAY_OF_WEEK);
        DayOfWeek dayOfWeek = DayOfWeek.of(5);
        System.out.println(getToday().getStartTimeStr() + "  "+ getToday().getEndTimeStr());
    }

    public static Day getToday() {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(new Date(System.currentTimeMillis()));
        calendar.set(11, 0);
//        calendar.set(12, 0);
//        calendar.set(13, 0);
        return new Day(calendar.getTimeInMillis());
    }

    public static class Day {
        Date startTime;
        Date endTime;

        public Day(long time) {
            this.startTime = new Date(time);
            this.endTime = new Date(time + 86400000L);
        }

        public long getStartTime() {
            return this.startTime.getTime();
        }

        public long getEndTime() {
            return this.endTime.getTime();
        }

        public String getStartTimeStr() {
            return format(this.startTime);
        }

        public String getEndTimeStr() {
            return format(this.endTime);
        }

        public boolean isInDay(long time) {
            return (time > this.startTime.getTime())
                    && (time < this.endTime.getTime());
        }

        public void setStartTime(Date startTime) {
            this.startTime = startTime;
        }

        public void setEndTime(Date endTime) {
            this.endTime = endTime;
        }

        public boolean isToday() {
            return isInDay(System.currentTimeMillis());
        }
    }

}
