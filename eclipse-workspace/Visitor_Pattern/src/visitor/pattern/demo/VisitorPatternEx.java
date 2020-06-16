package visitor.pattern.demo;

public class VisitorPatternEx {
	public static void main(String args[]) {
		System.out.println("***Visitro Pattern Demo***\n");
		IVisitor v = new Visitor();
		MyClass myClass = new MyClass();
		myClass.accept(v);
	}
}
