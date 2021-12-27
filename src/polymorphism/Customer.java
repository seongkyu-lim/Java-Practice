package polymorphism;

public class Customer {
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    // private는 자식 클래스도 변형불가, protected는 자식 클래스는 접근 가능.
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    //constructor , 멤버 초기화.
    public Customer() {
        customerGrade = "SILVER";
        bonusPoint = 0;
        bonusRatio = 0.01;
    }

    public int calcPrice(int price){

        bonusPoint += price*bonusRatio;

        return price;
    }

    public String showCustomerInfo(){

        return customerName+ ", your level is : "+ customerGrade+ " and your bonus is : "+bonusPoint;
    }





}
