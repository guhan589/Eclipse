package bridge.pattern.demo2;

public class Rectangle extends Shape
{
	public Rectangle(IColor c)
	{
		super(c);
	}

	void drawShape(int border)
	{
		System.out.print(" This Rectangle is colored with: ");
		color.fillWithColor(border);
	}

	void modifyBorder(int border,int increment) {
		System.out.println("\n Now we are changing the border length "+increment+ "times");
		border=border*increment;
		drawShape(border);
	}
}
