package Example1;

public class Textbox extends Component{

    public Textbox(Mediator dialog) {
        super(dialog);
    }
    
    public void write(){
        System.out.println("Writing in textbox");
    }
}
