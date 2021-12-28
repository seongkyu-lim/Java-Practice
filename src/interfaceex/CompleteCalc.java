package interfaceex;

public class CompleteCalc extends Calculator{

    @Override
    public int times(int num1, int num2) {
        return num1*num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 != 0) {
            return num1 / num2;
        }else {
            return -1;
        }
    }

    // default method를 재정의 할 수 있다.
    @Override
    public void description() {
        System.out.println("재정의한 묘사.");
    }
}
