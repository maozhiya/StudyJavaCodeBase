package Study.Day31;

/**
 * @author Li
 */
public class JumpDemo {
    public static void main(String[] args) {
        JumpOperator jo = new JumpOperator();
        Jump j = new Cat();
        System.out.print("Jump j = new Cat():");
        jo.useJump(j);

        //new Cat()
        Jump j2 = jo.getJump();
        System.out.print("Jump j2 = jo.getJump():");
        j2.jump();
    }
}
