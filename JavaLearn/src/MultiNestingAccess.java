/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/12 17:45
 * Modified By:
 * Description:从多层嵌套类中访问外部类的成员
 */
public class MultiNestingAccess {
    class MNA{
        private void f(){System.out.println("MNA私有方法f()");}
        class A{
            private void g(){System.out.println("A私有方法g()");}
            class B{
                void h(){
                    g();
                    f();
                }
            }
        }
    }
    public static void main(String args[]){
        MultiNestingAccess multiNestingAccess = new MultiNestingAccess();
        MultiNestingAccess.MNA mna = multiNestingAccess.new MNA();
        MultiNestingAccess.MNA.A mnaa = mna.new A();
        MultiNestingAccess.MNA.A.B mnaab = mnaa.new B();
        mnaab.h();
    }
}
