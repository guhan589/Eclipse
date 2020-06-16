package engineering.papers;

public abstract class BasicEngineering {
	public void Papers() {
		Math();
		SoftSkiles();
		SpecialPaper();
	}
	private void Math() {
		System.out.println("Mathematics");
	}
	
	private void SoftSkiles() {
		System.out.println("SoftSkils");
	}
	public abstract void SpecialPaper();
}
