package Example2_Remote;

public class Remote {
    protected Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void togglePower(){
        if(device.isEnabled()) device.disable();
        else device.enable();
    }

    public void volumeDown(){
        if(device.getVolume() > 0){
            device.setVolume(device.getVolume()-1);
        }
    }

    public void volumeUp(){
        if(device.getVolume() < 100){
            device.setVolume(device.getVolume()+1);
        }
    }

    public void channelDown(){
        if(device.getChannel() > 0){
            device.setChannel(device.getChannel()-1);
        }
    }

    public void channelUp(){
        if(device.getChannel() < 300){
            device.setChannel(device.getChannel()+1);
        }
    }
}
