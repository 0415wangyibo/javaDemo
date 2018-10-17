package test01;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created with Intellij IDEA.
 *
 * @author wangyb
 * @Date 2018/10/15 10:35
 * Modified By:
 * Description:
 */
public class Controller {
    private List<Event> eventList = new ArrayList<Event>();

    public void addEvent(Event c) {
        eventList.add(c);
    }
    public void run() {
        int j = 0;
        while (eventList.size() > 0) {
            j++;
            int i = 0;
            for (Event e : new ArrayList<Event>(eventList)) {
                i++;
                System.out.println("第"+j+"次循环的"+"第"+i+"比较");
                if (e.ready()) {
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }

    public static void main(String[] args){
        AEvent aEvent = new AEvent(1000000L);
        AEvent aEvent1 = new AEvent(100000L);
        Controller controller = new Controller();
        controller.addEvent(aEvent);
        controller.addEvent(aEvent1);
        controller.run();
    }
}
