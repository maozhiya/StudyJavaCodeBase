package Study.Day30;

/**
 * @author Li
 */
public class CatOperator {
    public void useCat(Cat c) {   //这里定义了，参数必须使用cat的对象，没有说承接cat的变量必须是多少 可以是a ，b，c皆可
        //这就是使用指定类的对象，当作其参数
        // TODO 自动生成的方法存根
        c.eat();
        //这是引用的cat里面的方法，当访问 useCat 时候，就会显示c.eat
    }


    /* 类名作为返回值的情况下该怎么去写 return！！！！！返回值定义为cat的对象 */

    public Cat getCat() {
        Cat c = new Cat ();
        return c;

    // return null;   其实return  null;也是可以的，但是没啥意义

    }
}
