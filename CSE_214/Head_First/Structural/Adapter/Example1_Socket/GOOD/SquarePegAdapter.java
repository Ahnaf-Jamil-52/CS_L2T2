package GOOD;

// Adapts the square peg to fit into the Round Hole
public class SquarePegAdapter extends RoundPeg{
    //Keep an instance of the Square Peg as a field
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    //Override the incompatible method in a way to fit the need
    @Override
    public double getRadius(){
        return peg.getWidth() * Math.sqrt(2) / 2;
    }
    
}
