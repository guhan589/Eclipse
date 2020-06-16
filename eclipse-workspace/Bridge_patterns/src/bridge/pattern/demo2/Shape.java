package bridge.pattern.demo2;

public abstract class Shape {
	protected IColor color;
	public Shape(IColor c) {
		this.color = c;
	}
	abstract void drawShape(int border);
	abstract void modifyBorder(int border,int increment);
}
