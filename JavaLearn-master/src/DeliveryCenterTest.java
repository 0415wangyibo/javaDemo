import com.sun.source.tree.Tree;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * @since 2018/9/14 11:39
 * Modified By:
 * Description:
 */
public class DeliveryCenterTest {
    @Test
    public void parseBeginDateToFormat() {
        String beginDate = "2018-02";
        Assert.assertEquals("2018-02-02", beginDate + "-" + "01");
        System.out.println(beginDate + "-" + "01");
    }

    @Test
    public void parseEndDateToFormat() {
        String endDate = "2018-09";
        String[] datePart = endDate.split("-");
        int year = Integer.parseInt(datePart[0]);
        int month = Integer.parseInt(datePart[1]);
        if (month == LocalDate.now().getMonthValue()) {
            System.out.println(endDate + "-" + LocalDate.now().with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth());
        } else {
            System.out.println(endDate + "-" + LocalDate.of(year, month, 1).with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth());
        }

        System.out.println();
    }

    @Test
    public void testNavigableMap() {
        TreeMap<Integer, Integer> map1 = new TreeMap<>();
        for (int i = 0; i < 10; i++) {
            map1.put(i, i);
        }

//        ConcurrentHashMap
//        HashMap
//        NavigableMap<Integer, Integer> map = map1.firstEntry();
        Map.Entry<Integer, Integer> entry = map1.firstEntry();
        System.out.println("key : " + entry.getKey() + " value : " + entry.getValue());
    }



}
