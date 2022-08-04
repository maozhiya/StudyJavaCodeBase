package Study.Day44;

import java.util.TreeSet;

/**
 * @author Li
 */

/* Comparable是个排序接口，若一个类实现了该接口，那么该类的数组和列表就可以通过Collections.sort或Arrays.sort进行自动排序。该接口中的只有一个compareTo(T o)方法：
        实现该接口的类通过重写该方法来定义该类的排序方式

*/

public class ComparableDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>();

        Student s1 = new Student("I", 17);
        Student s2 = new Student("Love", 16);
        Student s3 = new Student("You", 19);
        Student s4 = new Student("Love", 19);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        for (Student s : ts
             ) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
