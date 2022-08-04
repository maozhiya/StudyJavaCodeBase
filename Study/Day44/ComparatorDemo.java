package Study.Day44;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author Li
 */
public class ComparatorDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.age - s2.age;
                int num2 = (num == 0) ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });

        Student s1 = new Student("I", 19);
        Student s2 = new Student("Love", 18);
        Student s3 = new Student("You", 20);
        Student s4 = new Student("Me", 17);
        Student s5 = new Student("Me",17);
        Student s6 = new Student("You",17);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        for (Student s : ts) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
