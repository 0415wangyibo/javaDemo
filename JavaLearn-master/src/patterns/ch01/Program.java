package patterns.ch01;

import java.util.Scanner;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/7/31 13:53
 * Modified By:
 * Description: 大话设计模式第一章
 */
class Operation {
    private double firstNum = 0;
    private double secondNum = 0;

    public double getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(double firstNum) {
        this.firstNum = firstNum;
    }

    public double getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(double secondNum) {
        this.secondNum = secondNum;
    }

    public double getResult() {
        return 0.0;
    }
}

class OperationAdd extends Operation {
    @Override
    public double getResult() {
        double result;
        result = getFirstNum() + getSecondNum();
        return result;
    }
}

class OperationSub extends Operation {
    @Override
    public double getResult() {
        double result;
        result = getFirstNum() - getSecondNum();
        return result;
    }
}

class OperationMul extends Operation {
    @Override
    public double getResult() {
        double result;
        result = getFirstNum() * getSecondNum();
        return result;
    }
}

class OperationDiv extends Operation {
    @Override
    public double getResult() {
        double result;

        result = getFirstNum() / getSecondNum();
        return result;
    }
}

class OperationFactory {
    public static Operation createOperate(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
            default:
                break;
        }
        return operation;
    }
}

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入第一个数: ");
        String firstNum = scanner.nextLine();
        System.out.print("输入运算符(+-*/): ");
        String operator = scanner.nextLine();
        System.out.print("输入第二个数: ");
        String secondNum = scanner.nextLine();


        Operation operation;
        operation = OperationFactory.createOperate(operator);
        operation.setFirstNum(Double.parseDouble(firstNum));
        operation.setSecondNum(Double.parseDouble(secondNum));
        double result = operation.getResult();

        System.out.println(result);

        System.out.println(getResult(Double.parseDouble(firstNum), Double.parseDouble(secondNum), operator));
    }

    public static double getResult(double firstNum, double secondNum, String operator) {
        double result = 0.0D;

        switch (operator) {
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            case "/":
                try {
                    result = firstNum / secondNum;
                } catch (ArithmeticException e) {
                    System.out.println("除数不能为零");
                }
                break;
            default:
                break;
        }
        return result;
    }

}
