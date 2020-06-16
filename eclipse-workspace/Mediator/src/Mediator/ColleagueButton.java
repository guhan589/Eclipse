package Mediator;

import java.awt.Button;

public class ColleagueButton extends Button implements Colleague{

	private Mediator mediator;
	
	public ColleagueButton(String caption) {
		super(caption);
	}
	@Override
	public void setMediaior(Mediator mediator) {
		// TODO Auto-generated method stub
		this.mediator = mediator;
		
	}

	@Override
	public void setColleagueEnabled(boolean enabled) {
		// TODO Auto-generated method stub
		setEnabled(enabled); //true 일경우 버튼을 누를수 있고 false 일경우 버튼을 누를 수 없음.
		
	}

}
