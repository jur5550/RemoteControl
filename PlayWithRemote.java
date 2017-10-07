// the client
public class PlayWithRemote{
    
    public static void main(String[] args){
        DeviceButton button = new DeviceButton();
        //TV commands
        // create command receiver
        ElectronicDevice newTV = RemoteControl.GetTelevision();
        // create a concrete command
        TurnOn onTVCommand = new TurnOn(newTV);
        TurnOff offTVCommand = new TurnOff(newTV);
        VolumeUp tvVolumeUp = new VolumeUp(newTV);
        VolumeDown tvVolumeDown = new VolumeDown(newTV);
        // create invoker

        
        // invoke command

        
        // create another concrete command        


        // invoke another concrete command
        button.execute(onTVCommand);
        button.undo(onTVCommand);
        button.execute(offTVCommand);
        button.undo(offTVCommand);

        //Stereo Commands
        ElectronicDevice newStereo = RemoteControl.GetStereo();
        //concrete commands for stereo
        TurnOn onStereoCommand = new TurnOn(newStereo);
        TurnOff offStereoCommand = new TurnOff(newStereo);
        VolumeUp stereoVolumeUp = new VolumeUp(newStereo);
        VolumeDown stereoVolumeDown = new VolumeDown(newStereo);
        // create invoker
        // invoke commands
        button.execute(onStereoCommand);
        button.undo(onStereoCommand);
        button.execute(stereoVolumeUp);
        button.undo(stereoVolumeUp);
        button.execute(stereoVolumeDown);
        button.undo(stereoVolumeDown);
        button.execute(offStereoCommand);
        button.undo(offStereoCommand);
    }
}