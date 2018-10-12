public class Stock{

    private long stockNumber;
    private String stockDescription;
    private int amountInStock;

    public Stock(long stockNo, String stockDesc, int currentStock){

        stockNumber = stockNo;
        stockDescription = stockDesc;
        amountInStock = currentStock;
    }

    public int displayAmountInStock(){

        // this method should return the amount of stock
        return amountInStock;
    }

    public void displayAllDetails(){

        // display all the stock details
        System.out.println("Stock ID: "+stockNumber);
        System.out.println("Item Description: "+stockDescription);
        System.out.println("Remaining stock: "+amountInStock);
    }

    public void updateStockAmount(int amountBought) {

        if (amountBought > amountInStock) {
            System.out.println("Order too large, only " + displayAmountInStock() + " in stock");
        } else {
            amountInStock = amountInStock - amountBought;
            System.out.println("Order complete, new stock amount: " + displayAmountInStock());
        }
        /* this operation will deduct the amount bought from the amount in stock. A validation check must be done to ensure that sufficient stock exists to de deducted. You may wish to add additional operations/methods.*/
    }

    public void restock(int amountReceived){

        //add additional stock
        amountInStock = amountInStock+amountReceived;
        System.out.println("Restock complete, new stock amount: " + displayAmountInStock());

    }
}
