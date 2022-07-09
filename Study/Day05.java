package Study;

/**
 * @author Li
 */
public class Day05 {
    public static void main(String[] args) {
        // 一: 方法
        System.out.println("一: 方法");
        // 1. 方法概念: Java方法是语句的集合, 它们在一起执行一个功能
        // 2. 方法定义和调用
        /* 2.1 方法的定义:
            public static void 方法名() {
            方法体;
            }
        */
        /* 2.2 方法的调用
            方法名();
        */
        isEvenNumber();
        // 2.3 方法的名字的第一个单词应以小写字母作为开头,后面的单词则用大写字母开头写,不使用连接符
        // 3. 带参数的方法定义和调用
        /* 3.1 带参数的方法定义:
            public static void 方法名(数据类型 变量名1, 数据类型 变量名2, ...) {
                方法体;
            }
        */
        /* 3.2 方法的调用: 参数的数量和类型必须与方法定义中的设置相匹配, 否则程序会报错
            方法名(变量名1 / 常量值, 变量名2 / 常量值, ...);
        */
        getMax(5, 6);
        // 3.3 形参和实参
        // 3.3.1 形参: 方法中定义的参数
        // 3.3.2 实参: 方法中调用的实例
        // 4. 带返回值的方法的定义和调用
        /* 4.1 带返回值的方法定义格式:
            public static 数据类型 方法名(参数) {
                return 数据;
            // return 后面的返回值与方法定义上的数据类型相匹配,否额程序会报错
            }
        */
        /* 4.2 调用格式
            4.2.1 方法名(参数)
            4.2.2 数据类型 变量名 = 方法名(参数)   *常用
         */
        boolean flag = isEvenNum(20);
        System.out.println(flag);
        // 5. 方法的注意事项
        // 5.1 方法不能嵌套定义
        // 5.2 void 表示无返回值, 可以省略 return, 也可以单独的书写 return, 后面不加数据
        /* 6. 方法的通用格式
            public static 返回值类型 方法名(参数) {
                方法体;
                return 数据;
            }
            public: 修饰符,这是可选的,告诉编译器如何调用该方法,定义了该方法的访问类型
            返回值类型: 方法可能会返回值, returnValueType 是方法返回值的数据类型,有些方法执行所需的操作,但没有返回值,在这种情况下, returnValueType 是关键字void
            方法名: 是方法的实际名称,方法名和参数表共同构成方法签名
            参数类型：参数像是一个占位符,当方法被调用时,传递值给参数,这个值被称为实参或变量,参数列表是指方法的参数类型,顺序和参数的个数,参数是可选的,方法可以不包含任何参数
            方法体: 方法体包含具体的语句,定义该方法的功能
         */
    }
    /** 定义一个方法, 在方法中定义一个变量, 判断该数据是否是偶数 */
    public static void isEvenNumber() {
        int num = 10;
        if (num % 2 ==0) {
            System.out.println("num 是一个偶数");
        }
        else {
            System.out.println("num 是一个奇数");
        }
    }
    /** 定义一个带参数的方法, 在方法中定义一个变量, 判断该两个数据的大小值 */
    public static void getMax (int a, int b) {
        if (a > b) {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
    }
    /** 定义一个方法, 该方法中接收一个参数, 判断该参数是否为偶数, 并返回真假值 */
    public static boolean isEvenNum(int num) {
        if (num % 2 == 0) {
            return true;
        }
        else{
            return false;
        }
    }
}
