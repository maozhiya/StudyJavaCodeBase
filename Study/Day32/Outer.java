package Study.Day32;

/**
 * @author Li
 */

    /*
        内部类格式：
            public class 类名{
                  修饰符 class 类名{

                  }
            }

        内部类访问特点：
            内部类可以直接访问外部类的成员，包括私有
            外部类要访问内部类的成员，必须创建对象
     */

    /*
    成员内部类
        内部类与外部类的关系
            a.成员内部类的创建需要依赖于外部类对象-（成员方法必须通过对象调用），在没有外部类实例之前无法创建成员内部类对象
            b.内部类与外部类相对独立，不是is a 的关系（发动机-汽车）
            c.私有属性的互相访问，内部类可以直接访问外部类，而外部类访问内部类需要内部类的对象来访问
            d.创建内部类的语法
                1.在外部类内部创建内部类对象（Inner inner = new Inner()）
                2.在外部类外部创建内部类对象，外部类.内部类 inner = new Outer().new Inner();
            e.在内部类内部使用隐藏的外部类对象（隐藏的this）

        成员内部类：类比成员方法，不能拥有静态域但是可以访问外部类的静态域
    */

public class Outer {
    private int num = 10;

//    public class Inner {
//        public void show() {
//            System.out.println("show():" + num);
//        }
//    }

    private class Inner {
        int day = 32;
        public void show() {
            System.out.println("Outer show num:" + num);
            System.out.println("Outer show day:" + day);
        }
    }

    public void method() {
        // show();

        Inner i = new Inner();
        i.show();
    }
}
