import java.util.Scanner;

/**
 * Created by 71579 on 2018/6/8.
 */
public class NumGenerate {
    public static void main(String[] args) {
        contextLoads();
    }

    public static void contextLoads() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a num : ");
        int a = scanner.nextInt();
        int i;

//        Collections.sort();
        System.out.print("+3:  ");
        for (i = a; i <= 120; i += 3) {
            System.out.print(i + "  ");
        }
        for (int j = (i - 120); j < a; j += 3) {
            System.out.print(j + "  ");
        }
//        Collections.sort(integerList);
//        for (int j = 0; j < integerList.size(); j++) {
//            System.out.print(integerList.get(j) + "  ");
//        }
        System.out.println();

        System.out.print("+4:  ");
        for (i = a; i <= 120; i += 4) {
            System.out.print(i + "  ");
        }
        for (int j = (i - 120); j < a; j += 4) {
            System.out.print(j + "  ");
        }
        System.out.println();

        System.out.print("+3 +4:  ");
        for (i = a; i <= 120; ) {
            if (i > 120) {
                System.out.print((i - 120) + "  ");
            } else {
                System.out.print(i + "  ");
            }
            i = i + 3;
            if (i > 120) {
                System.out.print((i - 120) + "  ");
            } else {
                System.out.print(i + "  ");
            }
            i = i + 4;
        }
        for (int j = (i - 120); j < a; ) {
            System.out.print(j + "  ");
            j = j + 3;
            if (j > a) {
                break;
            } else {
                System.out.print(j + "  ");
                j = j + 4;
            }
        }
        System.out.println();

        System.out.print("+4 +5:  ");
        for (i = a; i <= 120; ) {
            if (i > 120) {
                System.out.print((i - 120) + "  ");
            } else {
                System.out.print(i + "  ");
            }
            i = i + 4;
            if (i > 120) {
                System.out.print((i - 120) + "  ");
            } else {
                System.out.print(i + "  ");
            }
            i = i + 5;
        }

        System.out.println();

//        System.out.print("5:  ");
//        for (i = a; i < 120; ) {
//            System.out.print(i + "  ");
//            i = i + 4;
//            System.out.println(i + "  ");
//            i = i + 5;
//        }
//        for (int j = (i - 120); j < a; ) {
//            System.out.print(j + "  ");
//            i = i + 4;
//            System.out.println(j + "  ");
//            i = i + 5;
//        }
//        System.out.println();

        System.out.println("End!");
    }
}
