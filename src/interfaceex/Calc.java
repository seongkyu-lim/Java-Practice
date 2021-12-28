package interfaceex;

public interface Calc {

    // 대문자로 변수 선언하면 자동으로  static final 붙음.
    double PI = 3.14;
    int ERROR = -999999999;

    int add(int num1, int num2);
    int subtract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);


}