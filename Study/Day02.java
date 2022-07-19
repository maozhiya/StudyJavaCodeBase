package Study;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Li
 */
public class Day02 {
    public static void main(String[] args) {
        // 一: 数据输入
        System.out.println("一: 数据输入");
        try (// 1. 导包
             // import java.util.Scanner;
             // 2. 创建对象
                Scanner sc = new Scanner(System.in)) {
             // 3. 接收数据
            System.out.println("input i:");
            int i = sc.nextInt();
            System.out.println("i = " + i);

            // 二: 流程控制: 顺序, 分支, 循环
            System.out.println("二: 分支语句");
            try (// 1.
                 // 1.1 if (关系表达式){ 语句体; }
                    /*
                     * 1.2
                     * if (关系表达式){
                     * 语句体 1;
                     * }
                     * else{
                     * 语句体 2;
                     * }
                     */
                    /*
                     * 1.3
                     * if (关系表达式1){
                     * 语句体 1;
                     * }
                     * else if (关系表达式2){
                     * 语句体 2;
                     * }
                     * ......
                     * else{
                     * 语句体 n + 1;
                     * }
                     */
                    // 2. switch 语句
                    /*
                     * switch (表达式) {
                     * case 值1:
                     * 语句体1;
                     * break;
                     * case 值2:
                     * 语句体2;
                     * break;
                     * ......
                     * default:
                     * 语句体 n + 1;
                     * [break];
                     * }
                     */
                    // 注意: 如果缺少 break , 会导致 case 穿透
                    Scanner weather = new Scanner(System.in)) {
                System.out.println("input weather: ");
                int month = weather.nextInt();
                switch (month) {
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("春季");
                        break;
                    case 6:
                    case 7:
                    case 8:
                        System.out.println("夏季");
                        break;
                    case 9:
                    case 10:
                    case 11:
                        System.out.println("秋季");
                        break;
                    case 12:
                    case 1:
                    case 2:
                        System.out.println("冬季");
                        break;
                    default:
                        System.out.println("input month error!");
                }
            }
            // 3. for
            /*
             * for (初始化语句; 条件判断语句; 条件控制语句) {
             * 循环体语句;
             * }
             */
            System.out.println("for 循环体语句开始---");
            for (int j = 0; j < 5; j++) {
                System.out.println(j + 1 + "次" + "Hello,World!");
            }
            System.out.println("for 循环体语句结束---");
            // 4. while --死循环常用 while
            /*
             * [初始化语句]
             * while (条件判断语句) {
             * 循环体语句;
             * [条件控制语句;]
             * }
             */
            System.out.println("while 循环体语句开始---");
            int wh = 0;
            while (wh < 5) {
                System.out.println(i + 1 + "次Hello,World!");
                wh++;
            }
        }
        System.out.println("while 循环体语句结束---");
        // 5. do...while
        /*
         * [初始化语句]
         * do{
         * 循环体语句;
         * [条件控制语句;]
         * } while(条件判断语句)
         */
        System.out.println("do...while 循环体语句开始---");
        int dw = 0;
        do {
            System.out.println(dw);
            dw++;
        } while (dw < 5);
        System.out.println("do...while 循环体语句结束---");

        // 三: 跳转控制语句
        System.out.println("三: 跳转控制语句");
        // 1. continue : 跳过某次循环体执行的内容, 继续下一次执行
        for (int ii = 0; ii < 5; ii++) {
            if (ii % 2 == 0) {
                continue;
            }
            System.out.println(ii);
        }
        // 2. break : 终止循环体内容的执行, 结束当前整个循环
        for (int kk = 0; kk < 5; kk++) {
            if (kk % 2 == 0) {
                break;
            }
            System.out.println(kk);
        }

        // 四: Random
        System.out.println("Random");
        // 1. 导包
        // import java.util.Random;
        // 2. 创建对象

        Random r = new Random();
        // 3. 获取随机数
        int ran = r.nextInt(10);
        // 获取数据的范围: [0, 10) --包括 0 但不包括 10
        System.out.println("ran: " + ran);
    }
}
