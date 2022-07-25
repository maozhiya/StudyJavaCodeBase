package Study.Day31;

/**
 * @author Li
 */
public class JumpOperator {
    public void useJump(Jump j) { //Jump j = new Cat();
        j.jump();
    }

    public Jump getJump() {
        Jump j = new Cat();
        return j;
    }
}
