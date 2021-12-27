package abstractex;

public class DeskTop extends Computer{

    @Override
    public void display() {
        System.out.println("화면을 띄우다.");
    }

    @Override
    public void typing() {
        System.out.println("입력하다.");
    }

    /**
     * 추상 메소드를 하위 클래스가 모두 구현하지 않았을 경우 하위 클래스도 추상 클래스여야만 한다.
     * 추상 클래스는 객체 인스턴스화 할 수 없다.
     * 추상 메소드가 존재하지 않아도 abstract를 추가하면 추상 클래스이다.
     * 이러한 경우의 이유는 객체 인스턴스화를 불가능하게 하여 상속용으로만 사용함을 명시하기 위해.
     */
}
