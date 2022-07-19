package Study.Day23;

// 导包: 导入Day22.Son的包
import Study.Day22.Son;
/**
 * @author Li
 */
public class Demo {
    public static void main(String[] args) {
        /* Study.Day22.Son s = new Study.Day22.Son(); */
        Son s = new Son();
        s.game();
        s.smoke();
        s.hang();

        /*
        * 访问权限修饰符:
        *   修饰类：public、默认修饰符
        *   修饰成员方法、成员变量:public、private、默认修饰符、protected
        *
        *
            public          当前类	    同一包	不同包中的子类	其他包
            protected       当前类	    同一包	不同包中的子类
            默认修饰符        当前类	    同一包
            private         当前类
        *
        *
        *   public修饰符
                使用注意：
                1.它可以用来修饰类，但它修饰类的时候文件名必须与类名一致
                2.因为它的范围最大，所以在很多位置都有可能造成它内容的修改，所以不推荐使用
                3.在子类继承的时候，它修饰的成员都可以被继承
        *
        *   protected修饰符
                使用注意：
                1.不可以使用它来修饰类在后面有解释。
                2.它修饰的成员需要注意的是其子类也可以访问
        *
        *   不使用修饰符（默认修饰符）
                使用注意：
                1.它也可以用来修饰类
        *
        *   private修饰符
                使用注意：
                1.不可以使用它来修饰类
                2.它修饰的成员变量只能通过，特定的方法来使用
                3.在继承中，它修饰的成员不能被继承
        *
        * 类的访问修饰符不使用private与protected的原因
        *   （1）不使用private的原因
                使用private修饰后那么它将无法实例化，它的成员将无法使用，所以创建的类可以说是白给
            （2）不使用protected的原因
                首先我们要知道它的访问范围，如果我们要使用这个类就必须继承它，但继承它有必须是它的子类才能继承，这样就产生了一个不可以实现的条件

        *
        *  */

        Dad d1 = new Dad();
        /* d1.showOne; */
        d1.showTwo();
        d1.showThree();
        d1.showFour();
        
        Son s1 = new Son();
        /*
        * s1.showOne;
        * s1.showTwo;
        * s1.showThree;
        */
        s1.showFour();
    }

}
