package Example1;

public class AuthDialog implements Mediator{
    private String title;
    private Checkbox loginOrRegCheckbox;
    private Textbox loginUsername, loginPassword;
    private String regUsername, regPassword;
    private Textbox regEmail;
    private Button okBtn, cancelBtn;

    public AuthDialog(){
        // CREATE ALL component objects and pass current mediator into their
        // constructors to establish links

        loginOrRegCheckbox = new Checkbox(this);
        loginUsername = new Textbox(this);
        loginPassword = new Textbox(this);
        regEmail = new Textbox(this);
        okBtn = new Button(this);
        cancelBtn = new Button(this);
    }

    public void setDummies(){
        this.title = "Nice Dialog";
        this.regUsername = "Zhao Yufan";
        this.regPassword = "CTS";
    }

    @Override
    public void notify(Component sender, String event){
        if(sender == loginOrRegCheckbox && event == "check"){
            if(loginOrRegCheckbox.isChecked()){
                title = "Log in";
            }
            else{
                title = "Register";
            }
        }

        if(sender == okBtn && event == "click"){
            if(loginOrRegCheckbox.isChecked()){
                // Find user using credentials
            }
            else{

            }
        }
    }

}
