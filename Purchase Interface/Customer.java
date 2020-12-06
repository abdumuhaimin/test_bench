public class Customer {
    private String customerName;
    private static String customerID;
    private Transaction trans;

    public Customer(String customerName, String customerID, Transaction trans){
        this.customerName = customerName;
        Customer.customerID = customerID;
        this.trans = trans;
    }


    public String getCustomerName(){
        return customerName;
    }

    public static String getCustomerID() {
        return customerID;
    }

    public Transaction getTrans() {
        return trans;
    }
}
