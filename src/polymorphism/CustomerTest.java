package polymorphism;

public class CustomerTest {

    public static void main(String[] args) {
        Customer lim = new Customer();
        VIPCustomer kim = new VIPCustomer();

        lim.setCustomerName("lim");
        lim.setCustomerID(10010);
        lim.bonusPoint = 1000;

        kim.setCustomerName("kim");
        kim.setCustomerID(10020);
        kim.bonusPoint = 10000;

        System.out.println(lim.showCustomerInfo());
        System.out.println(kim.showCustomerInfo());
    }
}
