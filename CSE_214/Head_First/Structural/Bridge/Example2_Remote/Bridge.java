package Example2_Remote;

// javac -d out *.java
// java -cp out Example2_Remote.Bridge

public class Bridge {
    public static void main(String[] args) {
        Device tv = new TV();
        Remote remote = new Remote(tv);
        remote.togglePower();
        tv.setChannel(57);  //internal trick, not supposed to control from here though, just for test
        tv.setVolume(30);   //this too

        remote.channelUp();
        System.out.println("Now tv channel: " + tv.getChannel());
        remote.volumeDown();
        System.out.println("Now tv volume: " + tv.getVolume());

        Device radio = new Radio();
        AdvancedRemote advRemote = new AdvancedRemote(radio);

        advRemote.togglePower();
        advRemote.volumeUp();
        advRemote.volumeUp();;
        advRemote.mute();
        System.out.println("Radio volume after mute: " + radio.getVolume());
        advRemote.unmute();
        System.out.println("Radio volume after unmute: " + radio.getVolume());
    }
}
