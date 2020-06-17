package Interpreter.pattern.demo;

public class InToWords implements IExpression{

	private String str;
	public InToWords(String str) {
		this.str = str;
	}
	@Override
	public void interpret(Context ic) {
		ic.printInWords(str);
	}

}
