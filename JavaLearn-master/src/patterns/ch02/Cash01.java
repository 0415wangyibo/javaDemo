package patterns.ch02;

import java.util.Scanner;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/8/1 09:20
 * Modified By:
 * Description:
 */
public class Cash01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入单价: ");
        double unit = scanner.nextDouble();
        System.out.print("请输入数量: ");
        int num = scanner.nextInt();

        double price = unit * num;

        System.out.printf("%.2f\n", price);
    }
}
