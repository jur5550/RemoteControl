// a concrete command
public class TurnOn implements Command {

    ElectronicDevice myDevice;
    
    public TurnOn(ElectronicDevice device){
        // register receiver
        myDevice = device;
    }
    
    public void execute() {

        myDevice.on();
    }
    @Override
    public void undo() {
        myDevice.off();
    }
}