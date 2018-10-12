import org.junit.Test;

/**
 * Created by 71579 on 2018/5/6.
 */
public class LeetCode {

    public static void main(String[] args) {
        System.out.println(isPalindrome(123321));
    }

    @Test
    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int n = s.length();
        if (x < 0) {
            return false;
        }
        if (n % 2 == 0) {
            String f = s.substring(0, n / 2);
            String b = new StringBuilder(s.substring(n / 2, n)).reverse().toString();
            if (!f.equals(b)) {
                return false;
            }
        } else {
            String f = s.substring(0, n / 2);
            String b = new StringBuilder(s.substring(n / 2 + 1, n)).reverse().toString();
            if (!f.equals(b)) {
                return false;
            }
        }
        return true;
    }
}
