package Study.Day10;

/**
 * @author Li
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("--------------");
        s.show();
        System.out.println("--------------");

        // public Student(String name)
        Student s1 = new Student("Li");
        s1.show();

        // public Student(int age)
        Student s2 = new Student(16);
        s2.show();

        // public Student(String name, int age)
        Student s3 = new Student("Li", 16);
        s3.show();
    }
}
