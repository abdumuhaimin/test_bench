public class Transaction{
    private int transID;
    private Item item = new Item();

    public Transaction(int transID){
        this.transID = transID;
    }

    public int getTransID(){
        return transID;
    }

    public Item getItem(){
        return item;
    }

    public double computeTotalPrice(){
        double price = getItem().getPrice();
        int quantity = getItem().getQuantity();
        return price * quantity;
    }
}
