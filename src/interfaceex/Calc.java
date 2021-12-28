package interfaceex;

public interface Calc {

    // 대문자로 변수 선언하면 자동으로  static final 붙음.
    double PI = 3.14;
    int ERROR = -999999999;

    int add(int num1, int num2);
    int subtract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    default void description(){
        System.out.println("설명하기.");
        myMethod();
    }

    // 객체 생성하지 않고 인터페이스에서 바로 가져와쓸수 있다.
    static int total(int[] arr){
        int total = 0;

        for(int i: arr){
            total += i;
        }
        myStaticMethod();
        return total;
    }

    private void myMethod(){
        System.out.println("private method");
    }

    //static private method는 static method에서만 사용, 반대도 마찬가지.
    private static void myStaticMethod(){
        System.out.println("static private method");
    }


}