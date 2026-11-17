package Example2;

public class Dot implements Graphic{
    protected int x, y;

    public Dot(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y){
        this.x += x;
        this.y += y;
    }

    @Override
    public void draw(){
        System.out.println("Drawing a DOT at: (" + this.x + ", " + this.y + ")");
    }
}
