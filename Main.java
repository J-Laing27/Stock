public class Main {

    public static void main(String[] args) {

        Stock s1 = new Stock(100,"Red Socks",100);
        Stock s2 = new Stock(101,"Blue Socks",90);
        Stock s3 = new Stock(102,"Green Socks",50);

        s1.updateStockAmount(90);
        s3.updateStockAmount(60);
        s2.restock(20);
    }
}
