/**
 * Created by Jur on 7-10-2017.
 */
public class VolumeDown implements Command {

    ElectronicDevice myDevice;

    public VolumeDown(ElectronicDevice device){

        myDevice = device;
    }

    public void execute() {

        myDevice.volumeDown();
    } @Override
    public void undo() {
        myDevice.volumeUp();
    }


}
