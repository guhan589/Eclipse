package State_Pattern;

import java.awt.*;
import java.awt.event.*;

public class SafeFrame extends Frame implements ActionListener, Context{
	private TextField textClock = new TextField(60);
	private TextArea textScreen = new TextArea(10,60);
	private Button buttonUse = new Button("�ݰ���");
	private Button buttonAlarm = new Button("���");
	private Button buttonPhone = new Button("�Ϲ���ȭ");
	private Button buttonExtie = new Button("����");	
	private State state = DayState.getInstance();
	public SafeFrame(String tittle) {
		super();
		setBackground(Color.LIGHT_GRAY);
		setLayout(new BorderLayout());
		add(textClock,BorderLayout.NORTH);
		textClock.setEditable(false);
		
		add(textScreen,BorderLayout.CENTER);
		textScreen.setEditable(false);
		
		Panel panel = new Panel();
		panel.add(buttonUse);
		panel.add(buttonAlarm);
		panel.add(buttonPhone);
		panel.add(buttonExtie);
		
		add(panel , BorderLayout.SOUTH);
		
		pack();
		
		setVisible(true);
		buttonUse.addActionListener(this);
		buttonAlarm.addActionListener(this);
		buttonPhone.addActionListener(this);
		buttonExtie.addActionListener(this);
		
	}
	@Override
	public void setClock(int hour) {
		String clockString = "���� �ð���";
		if(hour<10) {
			clockString = clockString + hour +":00";
		}else {
			clockString = clockString + hour +":00";
		}
		System.out.println(clockString);
		textClock.setText(clockString);
		state.doClock(this,hour);
		
	}

	@Override
	public void changeState(State state) {
		System.out.println(this.state + "����" + state + "�� ���°� ��ȭ�߽��ϴ�.");
		textScreen.append("=========="+this.state + "����" + state + "�� ���°� ��ȭ�߽��ϴ�."+"==========\n");
		this.state = state;
		
	}

	@Override
	public void callSecurityCenter(String msg) {
		textScreen.append("call"+msg+"\n");
	}

	@Override
	public void recordLog(String msg) {
		textScreen.append("record..."+msg+"\n");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.toString());
		if(e.getSource() == buttonUse) {
			state.doUse(this);
			
		}else if(e.getSource()==buttonAlarm) {
			state.doAlarm(this);
		}else if(e.getSource()==buttonPhone) {
			state.doPhone(this);
		}else if(e.getSource()==buttonExtie){
			System.exit(0);
		}else {
			System.out.println("?");
		}
	}
}
