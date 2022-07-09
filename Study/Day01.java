package Study;

/**
 * @author Li
 */
public class Day01 {
    public static void main(String[] args) {
        // 一: 我的第一个 Java 程序
        System.out.println("一: 我的第一个 Java 程序");
        System.out.println("Hello,World");

        // 二: 常量
        System.out.println("二: 常量");
        // 1.字符串
        System.out.println("Hello,World");
        // 2.整型
        System.out.println(666);
        System.out.println(-520);
        // 3.浮点型
        System.out.println(3.14);
        System.out.println(-4.27);
        // 4.字符
        System.out.println('Y');
        System.out.println('爱');

        // 三: 数据类型
        System.out.println("三: 数据类型");
        // 1. 计算机的存储单元， 计算机存储设备的最小单元信息叫"位"(bit)--比特位
        // 1B(字节) = 8bit, 1KB = 1024B, 1MB = 1024KB, 1GB = 1024MB, 1TB = 1024GB
        // 2. Java 语言是强类型语言
        // 2.1 数据类型: 基本数据类型和引用数据类型
        // 2.1.1 基本数据类型: 数值型(整数(默认int), 浮点数(默认double), 字符)和非数值型(布尔)
        // 2.1.2 引用数据类型: 类, 接口, 数组

        // 四: 变量
        System.out.println("四: 变量");
        // 1. 格式: 数据类型 变量名 = 变量值;
        int a = 10;
        System.out.println("a = " + a);
        // 1.1 修改格式: 变量名 = 变量值;
        a = 20;
        System.out.println("a = " + a);
        // 2. 变量注意事项
        // 2.1 名字不能重复 -- 例如: int a; double a;
        // 2.2 变量未赋值, 不能使用
        // 2.3 long 类型的变量定义的时候, 为了防止整数过大, 后面要加L -- 例如: long a = 123456789L;
        // 2.4 float 类型的变量定义的时候, 为了防止类型不兼容, 后面要加f -- 例如: float b = 3.14F;

        // 五: 标识符
        System.out.println("五: 标识符");
        // 1. 给类, 方法, 变量等起名字的符号
        // 2. 标识符规则
        // 3. 命名的约定  --小驼峰命名方法
        // 3.1 标识符是一个单词的时候, 首字母要小写 --name
        // 3.2 标识符由多个单词组成的时候, 第一个单词首字母要小写, 其他单词首字母大写 --firstName

        // 六: 类型转换
        System.out.println("六: 类型转换");
        // 1. 自动类型转换
        // byte -> short/(char) -> int -> long -> float -> double  注: byte / short !-> char
        double d = 10;
        System.out.println("d = " + d);
        // 2. 强制类型转换
        int k = (int)88.88;
        System.out.println("k = " + k);

        // 七: 运算符
        System.out.println("七: 运算符");
        // 1. 算术运算符
        int add = 2 + 3;
        System.out.println("2 + 3 = " + add);
        // 2. 字符的 '+' 操作
        int i = 10;
        char c = 'A';
        System.out.print("i + c =  ");
        System.out.println(i + c);
        // 注: 算术表达式中包含多个基本数据类型的值的时候, 整个算术表达式的类型会自动进行提升
        // 等级顺序: byte, short, char -> int -> long -> float -> double
        // 3. 字符串的 + 操作
        System.out.println("小柚子" + 4 + 27);
        System.out.println(4 + 27 + "小柚子");
        // 4. 赋值运算符
        // int ii = 10;ii += 20;
        // 注: 以下会报错
        /*
        short s = 10;
        s += 20;  --底层隐含了强制类型转换
        s = s + 20;   // bug
        s = (short)s + 20;
        */
        // 5. 自增自减运算符
        // i++ ++i i-- --i
        // 6. 关系运算符
        // == != > >= < <=
        // 7.1 逻辑运算符
        // 逻辑与: &    逻辑或: |   逻辑非: !   逻辑异或: ^
        // 7.2 短路逻辑运算符
        // 短路与: &&   短路路: ||
        // 常用的逻辑运算符: &&  ||  !
        // 8. 三元运算符
        // 格式: 关系表达式 ? 表达式1 : 表达式2
        int num_1 = 2;
        int num_2 = 1;
        int max = num_1 > num_2 ? num_1 : num_2;
        System.out.println("max = " + max);
    }
}
