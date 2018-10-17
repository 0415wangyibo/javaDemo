package listTest;

import javafx.collections.transformation.SortedList;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/15 13:45
 * Modified By:
 * Description:从去重排序性能上看，TreeSet是普通方法的20多倍;考虑到HashSet有默认排序时，HashSet排序速度是TreeSet的3倍
 * 总结：涉及到去重排序用TreeSet，仅去重用HashSet
 */
public class TreeSetTest {
    public static void main(String[] args){
        Random rand = new Random(47);
        long startTime1 = System.nanoTime();
        //默认是正序排序
        SortedSet<Integer> sortedSet = new TreeSet<>(Comparator.reverseOrder());
        for (int i=0;i<1000;i++){
            int date = rand.nextInt(30);
            sortedSet.add(date);
        }
        System.out.println(sortedSet);
        long endTime1 = System.nanoTime();
        System.out.println("运行时间："+(endTime1-startTime1)+"ns");
        long startTime2 = System.nanoTime();
        HashSet<Integer> list = new HashSet<>();
        for (int i=0;i<1000;i++){
            int date = rand.nextInt(30);
            list.add(date);
        }
        List<Integer> integerList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(integerList);
//        System.out.println(list);
        long endTime2 = System.nanoTime();
        System.out.println("运行时间："+(endTime2-startTime2)+"ns");
        //默认是区分英文大小写的正序排序
        Set<String> stringSet = new TreeSet<>(String::compareToIgnoreCase);
        stringSet.add("My");
        stringSet.add("add");
        stringSet.add("A");
        stringSet.add("args");
        stringSet.add("remove");
        System.out.println(stringSet);
    }
}
