public class RemoteControl {

    // return a command receiver
    public static ElectronicDevice GetTelevision(){
        
        return new Television();
    }

    public static ElectronicDevice GetStereo() {

        return new Stereo();
    }
}