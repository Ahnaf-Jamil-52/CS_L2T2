package Example2;

import java.util.ArrayList;

public class CompoundGraphic implements Graphic{
    //Store list of Graphic object children here
    public ArrayList<Graphic> children;

    public CompoundGraphic(ArrayList<Graphic> children) {
        this.children = children;
    }
    
    // Optional add and remove functionality
    public void add(Graphic child){
        this.children.add(child);
    }

    public void remove(Graphic child){
        this.children.remove(child);
    }

    @Override
    public void move(int x, int y){
        // DELEGATE task to all children
        for(Graphic shape : children){
            shape.move(x, y);
        }
    }

    @Override
    public void draw(){
        // DELEGATE task to all children
        System.out.println("Drawing compound shape containing: " + children.size() + " items.\nDetails:");
        for(Graphic shape : children){
            shape.draw();
        }
    }
}
