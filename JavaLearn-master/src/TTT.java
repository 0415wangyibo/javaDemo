import com.google.gson.Gson;
import org.junit.Test;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 71579 on 2018/7/4.
 */
public class TTT {

    public static void main(String[] args) {
        D a = new D();
        System.out.println(Double.valueOf(a.getD()) == null ? 0 : 1);
    }

    @Test
    public void mapTest() {
        List<Double> cost = Arrays.asList(10.0, 20.0, 30.0);
        (cost.stream().map(x -> x + x * 0.05)).forEach(x -> System.out.println(x));
    }

    static class D {

        public D() {
        }

        public double getD() {
            return Double.parseDouble(null);
        }
    }

    @Test
    public void dateTest() throws ParseException {
        String strDate = "2018-05-28 19:28:00";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.parse(strDate));
    }

    @Test
    public void testCollection() {
        List<String> stringList = new ArrayList<String>() {
            {
                add("111");
                add("222");
                add("333");
                add("444");
            }
        };

        stringList.remove(0);
        stringList.remove(0);
        stringList.add("111");
        System.out.println(stringList.get(2));
    }


    List<AA> aaList = new ArrayList<AA>() {{
        add(new AA());
    }};

    public void aa() {

        List<Integer> datas = new ArrayList<>();
        for (AA aa : aaList) {
            if (aa.getParentId().equals(6)) {
                datas.add(aa.getId());
            }
        }

        getData(datas);
    }

    public void getData(List<Integer> datas) {
        if (datas.size() == 0) {
            return;
        }

        for (Integer data : datas) {
            System.out.println(data);
            List<Integer> datas2 = new ArrayList<>();
            for (AA aa : aaList) {
                if (aa.getParentId().equals(data)) {
                    datas2.add(aa.getId());
                }
            }
            getData(datas2);
        }
    }

    class AA {
        private Integer id;
        private Integer parentId;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getParentId() {
            return parentId;
        }

        public void setParentId(Integer parentId) {
            this.parentId = parentId;
        }
    }


    @Test
    public void testReflect() {
        //获取类的字节码文件对象
        try {
            Class c = Class.forName("Student");
            Field[] f = c.getDeclaredFields();
            for (Field fie : f) {
                System.out.println(fie.getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void sub() {
        String imgUrl = "http://127.0.0.1:8080/cms/ReadAddress/1479805098158.jpg";

        String image = imgUrl.substring(0, imgUrl.lastIndexOf("/"));

        System.out.println(image);
    }

    @Test
    public void insertZero() {
        String newString = String.format("%02d", 15);
        System.out.println("newString === " + newString);
    }

    A jsonObject;

    @Test
    public void generateTree() {
        String str = "{\"label\":\"A\",\"child\":[{\"label\":\"AA\",\"child\":[{\"label\":\"AAA\"},{\"label\":\"AAB\"}]},{\"label\":\"AB\"}]}";

        A a = new A();

        List<A> aaList = new ArrayList<>();
        A aaa = new A();
        aaa.setLabel("AAA");
        aaa.setChild(null);
        aaList.add(aaa);
        A aab = new A();
        aab.setLabel("AAB");
        aab.setChild(null);
        aaList.add(aab);

        List<A> aList = new ArrayList<>();
        A aa = new A();
        A ab = new A();
        aa.setLabel("AA");
        aa.setChild(aaList);
        aList.add(aa);
        ab.setLabel("AB");
        ab.setChild(null);
        aList.add(ab);

        a.setLabel("A");
        a.setChild(aList);

        Gson gson = new Gson();
        System.out.println(gson.toJson(a));

        jsonObject = gson.fromJson(str, A.class);

        getDigui(jsonObject);

        System.out.println("把JSON字符串转为对象///  " + jsonObject.toString());
    }

    private void getDigui(A z) {
        if (z.getChild() == null) {

        }
//        jsonObject
    }

    class A {
        private String label;
        private List<A> child;

        public String getLabel() {
            return label;
        }

        void setLabel(String label) {
            this.label = label;
        }

        public List<A> getChild() {
            return child;
        }

        public void setChild(List<A> child) {
            this.child = child;
        }

        @Override
        public String toString() {
            return "{" +
                    "label='" + label + '\'' +
                    ", child=" + child +
                    '}';
        }
    }
}
