package templetemethod;

public class Avante extends Car{
    @Override
    public void drive() {
        System.out.println("달립니다.");
    }

    @Override
    public void stop() {
        System.out.println("멈춥니다.");
    }
}
