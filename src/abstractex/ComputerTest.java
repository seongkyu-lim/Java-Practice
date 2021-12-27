package abstractex;

public class ComputerTest {
    public static void main(String[] args) {

        DeskTop deskTop = new DeskTop();
        deskTop.display();
        deskTop.typing();
        deskTop.turnOff();
        deskTop.turnOn();

        Computer my = new MyNoteBook();
        my.display();
        my.typing();
    }
}
