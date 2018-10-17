package listTest;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/15 15:30
 * Modified By:
 * Description:可以通过优先队列任务排序，并优先执行，类似于银行的VIP业务;具体实体类可以自行定义排序规则，也可以实现组合排序;
 * 注意：PriorityQueue组合排序有问题，组合排序用List
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Random rand = new Random(45);
        for (int i = 0; i < 10; i++) {
            priorityQueue.add(rand.nextInt(i + 10));
        }
        ListTest.printQ(priorityQueue);
        List<Integer> ints = Arrays.asList(25, 22, 20, 18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
        priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        priorityQueue.addAll(ints);
        ListTest.printQ(priorityQueue);

        long startTime1 = System.nanoTime();
        PriorityQueue<TestDate> testDatePriorityQueue = new PriorityQueue<>(new Comparator<TestDate>() {
            @Override
            public int compare(TestDate o1, TestDate o2) {
                return o2.getOrder().compareTo(o1.getOrder());
            }
        });
        testDatePriorityQueue.add(new TestDate(3, "超级管理员"));
        testDatePriorityQueue.add(new TestDate(0, "普通用户"));
        testDatePriorityQueue.add(new TestDate(1, "普通管理员"));
        testDatePriorityQueue.add(new TestDate(2, "高级管理员"));
        List<TestDate> testDateList = new ArrayList<>(testDatePriorityQueue);
        System.out.println(testDateList.toString());
        long endTime1 = System.nanoTime();
        System.out.println("用时：" + (endTime1 - startTime1) + "ns");

        long startTime2 = System.nanoTime();
        List<TestDate> list = new LinkedList<>();
        list.add(new TestDate(3, "超级管理员"));
        list.add(new TestDate(0, "普通用户"));
        list.add(new TestDate(1, "普通管理员"));
        list.add(new TestDate(2, "高级管理员"));
        list = list.stream().sorted(new Comparator<TestDate>() {
            @Override
            public int compare(TestDate o1, TestDate o2) {
                return o2.getOrder().compareTo(o1.getOrder());
            }
        }).collect(Collectors.toList());
        System.out.println(list.toString());
        long endTime2 = System.nanoTime();
        System.out.println("用时：" + (endTime2 - startTime2) + "ns");

        PriorityQueue<CompoundDate> compoundDatePriorityQueue = new PriorityQueue<>(new Comparator<CompoundDate>() {
            @Override
            public int compare(CompoundDate o1, CompoundDate o2) {
                int compare = 0;
                int date = o2.getOrder1() - o1.getOrder1();
                if (date != 0) {
                    compare = date > 0 ? 3 : -1;
                } else {
                    date = o2.getOrder2() - o1.getOrder2();
                    if (date != 0) {
                        compare = date > 0 ? 2 : -2;
                    } else {
                        date = o2.getOrder3() - o1.getOrder3();
                        if (date != 0) {
                            compare = date > 0 ? 1 : -3;
                        }
                    }
                }
                return compare;
            }
        });
        compoundDatePriorityQueue.add(new CompoundDate(1, 2, 3, "123"));
        compoundDatePriorityQueue.add(new CompoundDate(2, 3, 5, "235"));
        compoundDatePriorityQueue.add(new CompoundDate(1, 2, 2, "122"));
        compoundDatePriorityQueue.add(new CompoundDate(1, 3, 3, "133"));
        List<CompoundDate> compoundDateList = new ArrayList<>(compoundDatePriorityQueue);
        System.out.println(compoundDateList.toString());
        compoundDateList.sort(new Comparator<CompoundDate>() {
            @Override
            public int compare(CompoundDate o1, CompoundDate o2) {
                int compare = 0;
                int date = o2.getOrder1() - o1.getOrder1();
                if (date != 0) {
                    compare = date > 0 ? 3 : -1;
                } else {
                    date = o2.getOrder2() - o1.getOrder2();
                    if (date != 0) {
                        compare = date > 0 ? 2 : -2;
                    } else {
                        date = o2.getOrder3() - o1.getOrder3();
                        if (date != 0) {
                            compare = date > 0 ? 1 : -3;
                        }
                    }
                }
                return compare;
            }
        });
        System.out.println(compoundDateList.toString());
    }
}
