package lambda.optional;

import java.util.Optional;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/7/9 15:26
 * Modified By:
 * Description:
 */
public class OptionalTest {
    public static void main(String[] args) {
        User user = new User();
        user.setName("CCTV");
        System.out.println(getUsernam1(user));
    }

    public static String getUsername(User user) {
        if (user == null) {
            return "Null";
        }
        return user.name;
    }

    public static String getUsernam1(User user) {
        return Optional.ofNullable(user)
                .map(user1 -> user1.name)
                .orElse("Null");
    }

    static class User {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
