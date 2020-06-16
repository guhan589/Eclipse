package Command_Pattern;

import java.awt.Color;
import java.awt.Point;

public class DrawCommand implements Command{

	protected Drawable drawable;
	private Point position;
	private Color color;
	public DrawCommand(Drawable drawable, Point position,Color color) {
		this.drawable = drawable;
		this.position = position;
		this.color = color;
	}
	@Override
	public void execute() {
		drawable.draw(position.x, position.y,color);
	}

}
