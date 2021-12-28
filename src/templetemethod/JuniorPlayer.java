package templetemethod;

public class JuniorPlayer extends Player{

    int jumpNum = 1;


    @Override
    public void jump() {
        System.out.println("점프할 줄 모르지롱.");
    }

    @Override
    public void run(){
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void turn(){
        System.out.println("턴할 줄 모르지롱");
    }

    @Override
    public void start() {
        System.out.println("==========초보자 레벨입니다.==========");
    }
}
