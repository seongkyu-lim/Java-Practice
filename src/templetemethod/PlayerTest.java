package templetemethod;

public class PlayerTest {
    public static void main(String[] args){

        Player junior = new JuniorPlayer();
        Player senior = new SeniorPlayer();
        Player pro = new ProPlayer();

        junior.setJumpNum(1);
        senior.setJumpNum(2);
        pro.setJumpNum(3);

        PlayerTest test = new PlayerTest();

        test.execute(junior);
        test.execute(senior);
        test.execute(pro);

    }

    public void execute(Player player) {
        player.start();
        player.go();
    }
}
