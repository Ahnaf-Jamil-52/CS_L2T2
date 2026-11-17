package Example2_Remote;

public class Radio implements Device{
    private boolean isEnabled;
    private int volume;
    private int channel;

    @Override
    public void disable() {
        if(isEnabled) this.isEnabled = false;
    }

    @Override
    public void enable() {
        if(!isEnabled) this.isEnabled = true; 
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void setVolume(int percent) {
        this.volume = percent;
    }
    
}
