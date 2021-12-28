package templetemethod;

public abstract class Player {

    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void start();

    public int getJumpNum() {
        return jumpNum;
    }

    public void setJumpNum(int jumpNum) {
        this.jumpNum = jumpNum;
    }

    private int jumpNum = 1;

    final public void go() {
        run();
        for (int i=0; i<jumpNum; i++){
            jump();
        }
        turn();
    }
}
