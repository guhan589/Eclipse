package visitor.pattern.demo;

public class Visitor implements IVisitor{

	@Override
	public void visit(MyClass myclass) {
		System.out.println("Visitor is trying to change the integer value");
		myclass.setMyInt(100);
		System.out.println("Exiting from Visitor- visit");
		
	}
	
}
