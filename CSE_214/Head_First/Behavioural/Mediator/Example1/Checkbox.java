package Example1;

public class Checkbox extends Component{

    private boolean checked;

    public Checkbox(Mediator dialog) {
        super(dialog);
        this.checked = false;
    }
    
    public void check(){
        dialog.notify(this, "check");
        this.checked = true;
    }

    public boolean isChecked(){
        return this.checked;
    }
}
