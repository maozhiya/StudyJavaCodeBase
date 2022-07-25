package Study.Day33;

/**
 * @author Li
 */

/*
    Object 是类层次结构的根，每个类都可以将 Object 作为超类。所有类都直接或者间接的继承自该类

    看方法源码：选中方法，按下Ctrl+B

    建议所有子类重写此方法：toString()

    怎么重写呢？自动生成即可
 */

/*
    public class Object
    类Object是类层次结构的根。 每个类都有Object作为超类。 所有对象（包括数组）都实现了这个类的方法。
    Object​() 构造一个新对象。
*/

public class ObjectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Li");
        s.setAge(17);
//         public void println(String x) {
//             synchronized (this) {
//             print(x);
//             newLine();
//            }
//         }

        /** Study.Day33.Student@1b6d3586 */
        System.out.println("s:" + s);
        // Study.Day33.Student@1b6d3586
        System.out.println("s.toString():" + s.toString());

        Student s1 = new Student();
        s.setName("Li");
        s.setAge(17);
        System.out.println("s == s1:" + (s == s1));

//        public boolean equals(Object obj) {
            // this --- s
            // obj --- s1
//          return (this == obj);
//        }

        System.out.println("s.equals(s1):" + s.equals(s1));
    }
}
