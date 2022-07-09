package Study.Day16;

/**
 * @author Li
 */
public class StringBuilderAndString {
    public static void main(String[] args) {
        /*
            StringBuilder 转换为 String:
            public string toString();通过 toString，就可以实现把 StringBuilder 转换为 string
        * */
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        // String s = sb    ---->  这样是不行的
        String s = sb.toString();
        System.out.println("s:" + s);

        /*
            string 转换为 StringBuilder:
            public StringBuilder(String s); 通过构造方法，就可以实现把 String 转换成 StringBuilder
        * */
        String s1 = "World";
        // StringBuilder sb1 = s1;  ---->  这样是不行的
        StringBuilder sb1 = new StringBuilder(s1);
        System.out.println("sb1:" + sb1);
    }
}
