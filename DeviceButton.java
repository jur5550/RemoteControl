import java.util.Stack;

// invoker
public class DeviceButton {
    Stack<Command> stack = new Stack<Command>();
    public void execute(Command cmd){
        
        System.out.println("Device button is pressed!");
        stack.add(cmd);
        cmd.execute();
    }

    public void undo(Command cmd) {
        System.out.println("Undoing last command!");
        stack.add(cmd);
        cmd.undo();

    }
}