package Study.Day44;

/**
 * @author Li
 */

/* 实现该接口的类通过重写该方法来定义该类的排序方式 */

public class Student implements Comparable<Student>{
    String name;
    int age;

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

    @Override
    public int compareTo(Student s) {
        // return 0;

        // return 1;

        // return -1;

        // 升序 this 放前面, 降序 this 放后面
        int num = this.age - s.age;
        // int num = s.age - this.age;

        int num2 = num==0?this.name.compareTo(s.name):num;
        return num2;
    }
}
