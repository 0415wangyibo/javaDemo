package Scanner;

import java.util.Scanner;

/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/17 10:32
 * Modified By:
 * Description:输入以，隔开的整型
 */
public class ScannerDelimiter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("12,42,78,99,42");
        scanner.useDelimiter("\\s*,\\s*");
        while (scanner.hasNextInt()) {
            System.out.println(scanner.nextInt());
        }
    }
}
