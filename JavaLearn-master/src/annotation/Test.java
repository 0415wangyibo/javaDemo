package annotation;

/**
 * Created by 71579 on 2018/6/4.
 */
@TestAnnotation
@ReqParam("132")
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.say();

        boolean hasAnnotation = Test.class.isAnnotationPresent(TestAnnotation.class);
        if (hasAnnotation) {
            TestAnnotation testAnnotation = Test.class.getAnnotation(TestAnnotation.class);

            System.out.println(testAnnotation.id());

            System.out.println(testAnnotation.msg());
        }
    }
}
