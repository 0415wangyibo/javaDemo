package generic;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/8/22 11:08
 * Modified By:
 * Description:
 */

interface HasColor {
    Color getColor();
}

class Colored<T extends HasColor> {
    T item;

    Colored(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }

    Color color() {
        return item.getColor();
    }
}

class Dimension {
    public int x, y, z;
}

class ColoredDimension<T extends Dimension & HasColor> {
    T item;

    public ColoredDimension(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    Color color() {
        return item.getColor();
    }

    int getX() {
        return item.x;
    }

    int getY() {
        return item.y;
    }

    int getZ() {
        return item.z;
    }
}

interface Weight {
    int weight();
}

class Solid<T extends Dimension & HasColor & Weight> {
    T item;

    public Solid(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    Color color() {
        return item.getColor();
    }
}

class Fruit {
}

class Apple extends Fruit {
}

class ApplePie extends Apple {
}

class Orange extends Fruit {
}

class UserList<W, T> {
    void f1(W w) {
    }

    void f2(T t) {
    }
}

public class BasicBounds {
    public static void main(String[] args) {
        List<? extends Apple> list1 = new ArrayList<Apple>();
        List<? extends Apple> list2 = new ArrayList<ApplePie>();

        List<? super ApplePie> list3 = new ArrayList<ApplePie>();
        List<? super ApplePie> list4 = new ArrayList<Apple>();
        //        list.add(new Apple());
    }
}
