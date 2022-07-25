package Study.Day33;

/**
 * @author Li
 */
public class Student extends Object{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    /* 返回对象的字符串表示形式。 一般来说， toString方法返回一个“ toString代表”这个对象的字符串。 结果应该是一个简明扼要的表达，容易让人阅读。 建议所有子类覆盖此方法。  */

    /** String toString​() 返回对象的字符串表示形式。  */
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /** equals 重写 */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Student student = (Student) o;

        if (age != student.age) {
            return false;
        }
        return name != null ? name.equals(student.name) : student.name == null;
    }
}
