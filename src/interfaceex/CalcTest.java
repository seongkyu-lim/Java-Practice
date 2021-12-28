package interfaceex;

import java.sql.Connection;

public class CalcTest {
    public static void main(String[] args){

        CompleteCalc calc = new CompleteCalc();

        int n1 = 10;
        int n2 = 2;

        System.out.println(calc.add(10, 2));
        System.out.println(calc.divide(10, 2));
        System.out.println(calc.times(10, 2));
        System.out.println(calc.subtract(10, 2));

    }
}
