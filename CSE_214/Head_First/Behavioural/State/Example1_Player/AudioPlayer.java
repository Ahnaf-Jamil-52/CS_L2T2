package Example1_Player;

public class AudioPlayer {
    private State state;
    private UserInterface UI;
    private int volume;
    private String playlist;
    private String currentSong;

    public AudioPlayer(){
        this.state = new ReadyState(this);

        // Context delegates handling user input to a state object.
        this.UI = new UserInterface();
    }

    // Let concrete objects use this method to change ACTIVE state
    public void changeState(State state){
        this.state = state;
    }

    // UI methods delegate execution to active state
    public void clickLock(){
        state.clickLock();
    }
}
