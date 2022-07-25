package Study.Day32;

/**
 * @author Li
 */

/*
    前提：
	    存在一个类或者接口
		这里的类可以是具体类也可以是抽象类

	格式：
		new 类名或者接口名(){
			重写方法;
		};

	本质是什么呢?
	    是一个继承了该类或者实现了该接口的子类匿名对象
 */

    /*匿名内部类的一些特点
        1. 匿名内部类没有类名
        2. 匿名内部类中不能声明静态变量（匿名内部类内部访问静态非静态都可以访问，外部访问没有类名无法访问）（可以声明常量）。
        3. 匿名内部类总不能声明静态方法
        4. 不能定义构造方法（本身在定义匿名内部类的同时已经实例化对象，这个类也不能再实例化另外的对象。没有类名也没有办法编写构造方法）
    */

public class NunInner {
    public void method() {
        /*
        new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };
        */

//        show();

//        new Inter() {
//            @Override
//            public void show() {
//                System.out.println("匿名内部类");
//            }
//        }.show();
//
//        new class() {
//            @Override
//            public void show() {
//                System.out.println("匿名内部类");
//            }
//        }.show();

        new Inter(){
            @Override
            public void showOne() {
                System.out.println("NunInner 匿名内部类");
            }
        }.showOne();

        Inter i = new Inter() {
            @Override
            public void showOne() {
                System.out.println("匿名内部类");
            }
        };

        System.out.print("First:");
        i.showOne();
        System.out.print("Second:");
        i.showOne();
    }
}
