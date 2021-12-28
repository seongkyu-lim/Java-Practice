package interfaceex;

public class Customer implements Buy, Sell{
    @Override
    public void buy() {
        System.out.println("customer buy");
    }

    //디폴트 메소드의 이름이 겹치는 경우 지정해주거나 재정의 해줄 수 있다.
    @Override
    public void order() {
        Buy.super.order();
        // Sell.super.order():
        // System.out.println("customer order"):
    }

    @Override
    public void sell() {
        System.out.println("customer sell");
    }

    public void sayHello(){
        System.out.println("hello");
    }
}
