import java.util.List;

public class Box {
    private List<Box> boxes;
    private List<Product> products;

    public Box(List<Box> boxes, List<Product> products) {
        this.boxes = boxes;
        this.products = products;
    }

    public double calculatePrice(){
        double sum = 0;

        if (products != null) {
            sum = products.stream()
                    .mapToDouble(Product::getPrice)
                    .sum();
        }

        if (boxes != null) {
            for (Box box : boxes){
                sum = sum + box.calculatePrice();
            }
        }
        return sum;
    }
}