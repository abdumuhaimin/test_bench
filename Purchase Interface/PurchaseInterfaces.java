import java.util.Scanner;

public class PurchaseInterfaces {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("CUSTOMER INFORMATION");
        System.out.println("Required User Input");
        System.out.print("Please enter customer name:\t");

        String name = input.next();

        System.out.print("Please enter member id: \t");

        String id = input.next();

        System.out.println("Please enter Transaction id:\t");

        int transid = input.nextInt();

        System.out.println("CREATING OBJECTS For 1. Transaction 2. Customer");

        Transaction transaction = new Transaction(transid);
        Customer customer = new Customer(name,id,transaction);

        System.out.println("Object creation is completed");

        System.out.println("ITEM INFORMATION");
        System.out.println("Required User Input");
        System.out.print("Please Enter Item Name:\t");


        String item_name = input.next();
        transaction.getItem().setItemName(item_name);

        System.out.print("Please Enter Item Quantity:\t");

        int quantity = input.nextInt();
        transaction.getItem().setQuantity(quantity);

        System.out.print("Please Enter Item Price:\t");

        double price = input.nextInt();
        transaction.getItem().setPrice(price);

        item_name = transaction.getItem().getItemName();
        quantity = transaction.getItem().getQuantity();
        price = transaction.getItem().getPrice();

        double total_price = transaction.computeTotalPrice();

        System.out.println("TRANSACTION OUTPUT & TOTAL PRICE");
        System.out.println("Customer Name:\t"+customer.getCustomerName());
        System.out.println("Customer ID:\t"+ Customer.getCustomerID());
        System.out.println("Transaction ID:\t"+transaction.getTransID());
        System.out.println("Item Name:\t"+item_name+"\t || \tItem Quantity: "+quantity);
        System.out.println("Item Price: RM"+price+"\t || \tItem Total Price: RM"+total_price);

    }
}
