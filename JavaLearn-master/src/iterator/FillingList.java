package iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/7/30 09:41
 * Modified By:
 * Description:
 */
class StringAddress {
    private String s;

    public StringAddress(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return super.toString() + " " + s;
    }
}

public class FillingList {
    public static void main(String[] args) {
        List<StringAddress> stringAddressList = new ArrayList<>(
                Collections.nCopies(4, new StringAddress("Hello"))
        );
        System.out.println(stringAddressList);

        Collections.fill(stringAddressList, new StringAddress("world!"));
        System.out.println(stringAddressList);
    }
}
