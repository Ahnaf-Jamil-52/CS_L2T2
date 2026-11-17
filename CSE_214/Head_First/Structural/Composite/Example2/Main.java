package Example2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Graphic dot = new Dot(4, 5);
        Graphic circle = new Circle(2, 3, 1);
        Graphic circle2 = new Circle(8, 10, 2);

        dot.move(-1, 3);
        dot.draw();

        circle.move(4, -2);
        circle.draw();

        ArrayList<Graphic> shapes = new ArrayList<>();
        shapes.add(dot);
        shapes.add(circle);
        shapes.add(circle2);

        CompoundGraphic cg = new CompoundGraphic(shapes);
        cg.move(4, -5);
        cg.draw();

        cg.remove(circle);
        cg.draw();
        
    }
}
