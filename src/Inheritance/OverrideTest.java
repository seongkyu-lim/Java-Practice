package Inheritance;

public class OverrideTest {
    public static void main(String[] args){

        Customer lim = new Customer();
        VIPCustomer kim = new VIPCustomer();

        lim.setCustomerName("lim");
        lim.setCustomerID(10010);
        lim.bonusPoint = 1000;
        int payment1 = lim.calcPrice(10000);

        kim.setCustomerName("kim");
        kim.setCustomerID(10020);
        kim.bonusPoint = 10000;
        int payment2 = kim.calcPrice(10000);

        System.out.println(lim.showCustomerInfo()+". your payment is : "+payment1);
        System.out.println(kim.showCustomerInfo()+". your payment is : "+payment2);

        // 형변환이된 lee 객체는 타입은 Customer이며 인스턴스는 VIPCustomer이다.
        // 사용하는 메소드는 타입인 Customer에 제한되지만(메모리할당은 VIPCustomer의 메소드 및 변수까지 전부 됨.), overriding된 calcPrice 메소드의 경우에는 인스턴스를 따른다.
        // 이유 : Virtual function. (가리키는 메모리주소 다륾.)
        Customer lee = new VIPCustomer();

        lee.setCustomerName("lee");
        lee.setCustomerID(10000);
        int payment3 = lee.calcPrice(10000);
        System.out.println(lee.showCustomerInfo()+". your payment is : "+payment3);



    }
}
