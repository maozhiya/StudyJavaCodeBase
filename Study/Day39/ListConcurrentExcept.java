package Study.Day39;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Li
 */

/*
        ConcurrentModificationException:
            java.lang.Object
                java.lang.Throwable
                    java.lang.Exception
                        java.lang.RuntimeException
                            java.util.ConcurrentModificationException
    public class ConcurrentModificationException extends RuntimeException
    此异常可能会被抛出的方法，已检测到的对象的并发修改时，这样的修改是不允许的。

    例如，它通常是不允许一个线程而另一个线程遍历它修改集合。在一般情况下，迭代的结果是不确定的，在这种情况下。一些迭代器实现（包括所有通用收集实现的JRE提供）可以选择如果检测行为抛出该异常。迭代器这样做被称为快速失败迭代器，因为他们不能迅速、干净，而冒着任意的，非在将来一个不确定的时间确定的行为。

*/

public class ListConcurrentExcept {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Love");

        Iterator it = list.iterator();

        while (it.hasNext()) {
            // ConcurrentModificationException
            String s = (String) it.next();
            if (s.equals("World")){
                list.add("Java");
            }
            System.out.println(list);
        }


    }
}
