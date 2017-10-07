/**
 * Created by Jur on 7-10-2017.
 */
public class VolumeUp implements Command {

    ElectronicDevice myDevice;

    public VolumeUp(ElectronicDevice device){

        myDevice = device;
    }

    public void execute() {

        myDevice.volumeUp();
    }
    @Override
    public void undo() {
        myDevice.volumeDown();
    }

}
