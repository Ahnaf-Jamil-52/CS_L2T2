package Example1;

public class Button extends Component{

    public Button(Mediator dialog) {
        super(dialog);
    }

    public void changeColor(){
        System.out.println("changed color of btn");
    }
    
}
