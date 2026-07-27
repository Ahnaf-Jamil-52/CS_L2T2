
public class AmazonMain {
    private Box box;

    public AmazonMain() {

    }

    public void setupOrder(Box... boxes){
        this.box = new CompositeBox(boxes);
    }

    public double calculateOrderPrice(){
        return box.calculatePrice();
    }
}


