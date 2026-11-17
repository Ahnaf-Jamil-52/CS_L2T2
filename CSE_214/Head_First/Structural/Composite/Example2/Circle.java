package Example2;

public class Circle extends Dot{
    int radius;
    public Circle(int x, int y, int radius){
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw(){
        System.out.println("Drawing a CIRCLE of radius " + radius + 
            " with centre at: (" + this.x + ", " + this.y + ")");
    }
}
