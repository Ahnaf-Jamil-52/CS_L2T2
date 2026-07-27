
public class Book extends Product {
    public Book(String title, double price){
        super(title, price);
    }

    // For a concrete Product, just returns the price
    @Override
    public double calculatePrice() {
        return getPrice();
    }
}
