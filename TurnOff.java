// a concrete command
public class TurnOff implements Command {

    ElectronicDevice myDevice;

    public TurnOff(ElectronicDevice device){

        myDevice = device;
    }

    public void execute() {

        myDevice.off();
    }

    @Override
    public void undo() {
       myDevice.on();
    }
}