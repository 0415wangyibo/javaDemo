package stringBuilderTest;

import java.util.Random;

/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/16 10:11
 * Modified By:
 * Description:String与StringBuilder在字符串拼接上性能差不多，JVM会对String字符串拼接进行优化
 */
public class UsingStringBuilder {
    public static Random rand = new Random(45);
    public String builderToString(){
        StringBuilder result = new StringBuilder();
        for (int i=0;i<100;i++) {
            result.append(rand.nextInt(100));
            result.append(" ");
        }
        return result.toString();
    }
    public String stringToString(){
        String result = "";
        for (int i=0;i<100;i++) {
            result = result + rand.nextInt(100)+" ";
        }
        return result;
    }

    public static void main(String[] args){
        UsingStringBuilder usb = new UsingStringBuilder();
        long startTime1 = System.nanoTime();
        System.out.println(usb.builderToString());
        long endTime1 = System.nanoTime();
        System.out.println("StringBuilder用时："+(endTime1-startTime1)+"ns");

        long startTime2 = System.nanoTime();
        System.out.println(usb.stringToString());
        long endTime2 = System.nanoTime();
        System.out.println("String用时："+(endTime2-startTime2)+"ns");
    }
}
