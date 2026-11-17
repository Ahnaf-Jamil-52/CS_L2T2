package GOOD;

//From Example1_Socket...
//javac -d out GOOD/*.java
//java -cp out GOOD.Main

public class Main {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);

        System.out.println((roundHole.fits(roundPeg)? "roundPeg fits roundHole": "does not fit"));

        SquarePeg smallSquarePeg = new SquarePeg(5);
        SquarePeg largeSquarePeg = new SquarePeg(10);

        SquarePegAdapter smallAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeAdapter = new SquarePegAdapter(largeSquarePeg);

        System.out.println((roundHole.fits(smallAdapter)? 
                    "smallSquarePeg fits roundHole through adapter": "does not fit"));
        System.out.println((roundHole.fits(largeAdapter)? 
                    "largSquarePeg fits roundHole through adapter": "does not fit"));
    }
}
