package templetemethod;

public class SeniorPlayer extends Player{

    @Override
    public void jump() {
        System.out.println("높이 점프합니다.");
    }

    @Override
    public void run() {
        System.out.println("빨리 달립니다.");
    }

    @Override
    public void turn() {
        System.out.println("턴할 줄 모르지롱");
    }
    @Override
    public void start() {
        System.out.println("==========중급자 레벨입니다.==========");
    }
}
