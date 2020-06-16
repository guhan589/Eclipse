package visitor.pattern.demo;

public class MyClass implements IOriginalInterface{

	private int myInt=5;
	public MyClass() {
		super();
	}
	public int getMyInt() {
		return myInt;
	}
	public void setMyInt(int num) {
		this.myInt = num;
	}

	public void accept(IVisitor iVisitor) {
		System.out.println("Initial value of the integer :"+ myInt);
		iVisitor.visit(this);
		System.out.println("\nValue of the integer now :"+ myInt);
		
	}

}
