import java.util.*;
import java.util.stream.Collectors;

/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/11 10:50
 * Modified By:
 * Description:
 */
public class Test09 {
    public static void main(String args[]) {
        System.out.println("生成流：");
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        Collections.sort(filtered, Comparator.naturalOrder());
        filtered.forEach(System.out::println);
        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("合并字符串: " + mergedString);
        System.out.println("forEach方法、limit方法、sorted方法：");
        Random random = new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);
        System.out.println("map方法：");
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
//      获取对应的平方数
        List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        squaresList.forEach(System.out::println);
        System.out.println("filter方法：");
        List<String> strings1 = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
//      获取空字符串的数量
        int count = (int) strings1.stream().filter(string -> string.isEmpty()).count();
        System.out.println(count);
        System.out.println("parallel方法：");
        int countOne =(int)strings.parallelStream().filter(string -> string.isEmpty()).count();
        System.out.println(countOne);

        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.println("列表中最大的数 : " + stats.getMax());
        System.out.println("列表中最小的数 : " + stats.getMin());
        System.out.println("所有数之和 : " + stats.getSum());
        System.out.println("平均数 : " + stats.getAverage());
    }
}
