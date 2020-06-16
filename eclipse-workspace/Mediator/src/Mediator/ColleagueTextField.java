package Mediator;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class ColleagueTextField extends TextField implements TextListener, Colleague{

	private Mediator mediator;
	public ColleagueTextField(String text, int columns) {
		// TODO Auto-generated constructor stub
		super(text,columns);
	}
	@Override
	public void setMediaior(Mediator mediator) {
		// TODO Auto-generated method stub
		this.mediator = mediator;
		
	}
	@Override
	public void setColleagueEnabled(boolean enabled) {
		setEnabled(enabled);
		setBackground(enabled ? Color.white : Color.LIGHT_GRAY);
	}
	

	@Override
	public void textValueChanged(TextEvent e) { //문자열 변경시 Mediator에게 통치
		mediator.colleagueChanged();
	}

	
}
