package Example2_Remote;

public class AdvancedRemote extends Remote{
    private int unmuteVolume;
    
    public AdvancedRemote(Device device) {
        super(device);
        this.unmuteVolume = device.getVolume();
    }

    public void mute(){
        this.unmuteVolume = device.getVolume();
        device.setVolume(0);
    }

    public void unmute(){
        device.setVolume(this.unmuteVolume);
    }
}
