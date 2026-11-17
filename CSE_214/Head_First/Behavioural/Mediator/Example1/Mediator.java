package Example1;

public interface Mediator {
    // Abstract mediator interface, the AuthDialog is a concrete mediator
    // which implements the responses
    public void notify(Component sender, String event);
}
