package Study.Day09;

/**
 * @author Li
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        /*
         s.name = "高一";
         s.age = 16;
         System.out.println(s.name);
           将会报错, 因为 name 和 age 被 private 关键字修饰
        */

        s.setName("高一");
        s.setAge(16);
        s.show();
    }
}
