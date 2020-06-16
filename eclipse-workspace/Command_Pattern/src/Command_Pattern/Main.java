package Command_Pattern;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;


public class Main extends JFrame implements ActionListener, MouseListener, WindowListener{

	private MacroCommand history = new MacroCommand();
	private DrawCanvas canvas = new DrawCanvas(400, 400, history);

	private JButton clearButton = new JButton("clear");
	private JButton redButton = new JButton("red");
	private JButton greenButton = new JButton("green");
	private JButton blueButton = new JButton("blue");
	private JButton undoButton = new JButton("undo");
	private JButton redoButton = new JButton("redo");
	private Color color = Color.red;
	public Main(String title) {
		super(title);
		
		this.addWindowListener(this);
		canvas.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				Command cmd = new DrawCommand(canvas,e.getPoint(),color); //마우스 드래그 이벤트가 발생시 400*400 사이즈의 
				history.append(cmd);
				cmd.execute();
			}
		});
		clearButton.addActionListener(this);
		undoButton.addActionListener(this);
		redoButton.addActionListener(this);
		
		redButton.addActionListener(this);
		greenButton.addActionListener(this);
		blueButton.addActionListener(this);
		Box buttonBox = new Box(BoxLayout.X_AXIS);
		buttonBox.add(undoButton);
		buttonBox.add(clearButton);
		buttonBox.add(redoButton);
		
		Box colorBox = new Box(BoxLayout.X_AXIS);
		colorBox.add(redButton);
		colorBox.add(greenButton);
		colorBox.add(blueButton);
		
		Box mainBox = new Box(BoxLayout.Y_AXIS);
		mainBox.add(buttonBox);
		mainBox.add(colorBox);
		mainBox.add(canvas);
		getContentPane().add(mainBox);
		
		pack();
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==clearButton) { //draw clear
			history.clear();
			canvas.init();
			canvas.repaint(); 
		}else if(e.getSource()==undoButton) {
			history.undo();//MacroCommand
			canvas.repaint();//DrawCanvas
			canvas.paint(getGraphics());
		}else if(e.getSource()==redoButton) {
			canvas.repaint();
			history.redo();
			canvas.paint(getGraphics());
			
		}else if(e.getSource()==redButton) {
			color = Color.red;
			Command cmd = new ColorCommand(canvas, Color.red);
			history.append(cmd);
			cmd.execute();
		}else if(e.getSource()==greenButton) {
			color = Color.green;
			Command cmd = new ColorCommand(canvas, Color.green);
			history.append(cmd);
			cmd.execute();
		}else if(e.getSource()==blueButton) {
			color = Color.blue;
			Command cmd = new ColorCommand(canvas, Color.blue);
			history.append(cmd);
			cmd.execute();
		}
	}
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	public static void main(String[]args) {
		new Main("Command Pattern Sample");
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
