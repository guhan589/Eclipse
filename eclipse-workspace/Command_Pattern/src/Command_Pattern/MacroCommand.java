package Command_Pattern;

import java.util.Iterator;
import java.util.Stack;

public class MacroCommand implements Command{
	private Stack commands = new Stack();
	private Stack redoCommands = new Stack();
	@Override
	public void execute() {
		System.out.println("exeucte");
		Iterator it = commands.iterator();
		while(it.hasNext()) {
			((Command)it.next()).execute();
		}		
	}

	public void append(Command cmd) {
		if(cmd!=this)
			commands.push(cmd);
	}
	public void redo() {
		if(!redoCommands.empty())
			commands.push(redoCommands.pop());
	}
	public void undo() {
		if(!commands.empty())
			redoCommands.push(commands.pop());
	}
	public void clear() {
		commands.clear();
	}
}
