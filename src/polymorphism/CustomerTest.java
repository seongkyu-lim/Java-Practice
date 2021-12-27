package polymorphism;

public class CustomerTest {

    public static void main(String[] args) {
        Customer lim = new Customer();
        VIPCustomer kim = new VIPCustomer();
        GoldCustomer lee = new GoldCustomer();

        lim.setCustomerName("lim");
        lim.setCustomerID(10010);
        lim.bonusPoint = 1000;

        kim.setCustomerName("kim");
        kim.setCustomerID(10020);
        kim.bonusPoint = 10000;


        lee.setCustomerName("lee");
        lee.setCustomerID(100);
        lee.bonusPoint = 5000;

        System.out.println(lee.calcPrice(1000));


        System.out.println(lim.showCustomerInfo());
        System.out.println(kim.showCustomerInfo());
        System.out.println(lee.showCustomerInfo());
    }
}
