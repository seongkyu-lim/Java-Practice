package abstractex;

// 추상 클래스 :  추상 메소드를 가지는 클래스.
public abstract class Computer {

    // 추상 메소드 ( 바디가 없이 선언부만 있는 메소드. )
    public abstract void display();
    public abstract void typing();

    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }
    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }


}
