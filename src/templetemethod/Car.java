package templetemethod;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();

    public void startCar(){
        System.out.println("시동을 켠다.");
    }

    public void turnOff(){
        System.out.print("시동을 끈다");
    }

    //추상 메소드로 구현하면 반드시 하위클래스에서 재정의를 해주거나 하위클래스를 abstract로 바꿔주어야한다.
    // 이렇게 바디라인만 추가해주면 하위 클래스에서 구현시에만 사용이되는 메소드로 사용.
    public void washCar(){}

    // final로 선언하면 run 메소드 재정의 안됨.
    // templete method -> 시스템의 흐름은 정해져서 하위 클래스에서 수정 불가.
    final public void run(){
        startCar();
        drive();
        stop();
        turnOff();
        washCar();
    }
}
