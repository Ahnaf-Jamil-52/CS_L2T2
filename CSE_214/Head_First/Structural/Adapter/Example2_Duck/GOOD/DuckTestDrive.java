package GOOD;

public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();

        // The turkeyAdapter returns the turkey wrapped into parent Duck interface 
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says:");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe duck says:");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says:");
        testDuck(turkeyAdapter);
    }

    // Just a random test method packed to test if TurkeyAdapter behaves the same as a Duck object
    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
