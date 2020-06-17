package command.pattern.demo;

public class Receiver {
	public void performUndo() {
		System.out.println("Executing - MyUndoCommand");
	}
	public void performRedo() {
		System.out.println("Executing - MyRedoCommand");
	}
}
