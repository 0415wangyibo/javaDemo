package patterns.ch09;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/8/1 16:37
 * Modified By:
 * Description:
 */
public class Ch09 {
    public static void main(String[] args) {
        List<String> famMem = new ArrayList<String>() {{
            add("Baba");
            add("Mama");
        }};

        Resume resume1 = new Resume("Yyy");
        resume1.setPerson(20, famMem);
        resume1.setWork("2013/8/1 - 2015/6/30", "Huawei");

        Resume resume2 = resume1.clone();
        resume2.setName("Ccc");
        resume2.famMem.add("Bro");
        resume2.setWork("2015/7/1 - 2016/6/30", "Baidu");

        resume1.display();
        resume2.display();

    }
}
