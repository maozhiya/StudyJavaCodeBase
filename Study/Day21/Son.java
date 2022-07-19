package Study.Day21;

/**
 * @author Li
 */
public class Son extends Dad{
    public void method() {
        System.out.println("Son 中的 method 方法被调用");
    }

    /*
        方法重写:子类重写父类的方法，要求方法名和参数类型完全一样(参数不能是子类)，返回值和异常比父类小或者相同(即为父类的子类)，访问修饰符比父类大或者相同
        方法覆盖重写的注意事项：
            1：必须保证父子类之间方法的名称相同，参数列表也相同。
            @Override:写在方法前面，用来检测是不是有效的正确的覆盖重写。
            这个注释就算不写，只要满足要求，也是正确的方法覆盖重写。

            2：子类方法的返回值必须{小于等于}父类方法的返回值范围
            小扩展提示：object类是所有类的公共最高父类（祖宗类），String就是object的子类

            3：子类方法的权限必须{大于等于}父类方法的权限修饰符。
            小扩展提示： public > protected > (default) > private
            备注：（default）不是关键字default， 而是神马都不写，留空
    * */

    @Override
    public void show() {
        super.show();
        System.out.println("Son 中的 show 方法被调用");
    }

//    @Override
//    public void show1() {
//        System.out.println("Son 中的 show2 方法被调用()");
//    }

    @Override
    public void show2() {
        System.out.println("Son 中的 show2 方法被调用(默认修饰符)");
    }

//    @Override
//    void show3() {
//        System.out.println("Son 中的 show3 方法被调用(public)");
//    }
}
