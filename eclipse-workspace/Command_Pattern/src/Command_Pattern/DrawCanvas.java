package Command_Pattern;

import java.awt.*;


public class DrawCanvas extends Canvas implements Drawable{

	private Color color;
	private int radius;
	private MacroCommand history;
	
	public DrawCanvas(int width, int height, MacroCommand history) {
		setSize(width,height); //�׸� ���� ������ ����
		setBackground(Color.white); //������ ȭ��Ʈ ����
		this.history = history;
		init();
	}
	public void paint(Graphics g) {
		history.execute();
	}
	@Override
	public void draw(int x, int y) {
		Graphics g = getGraphics();
		g.setColor(color);
		g.fillOval(x-radius, y-radius, radius*2, radius*2);
		
	}
	@Override
	public void init() { //�⺻ color�� red�� ����	
		color = Color.red;
		radius = 6;
	}
	@Override
	public void setColor(Color color) {
		this.color = color;	
	}
	
}
