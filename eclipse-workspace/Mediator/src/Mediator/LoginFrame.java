package Mediator;

import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends Frame implements ActionListener, Mediator{

	private ColleagueCheckbox checkGuest,checkLogin, checkMember;
	private ColleagueTextField textUser, textPass, textNumber;
	private ColleagueButton buttonOk, buttonCancle;
	
	public LoginFrame(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		setBackground(Color.LIGHT_GRAY);
		setLayout(new GridLayout(5,3));
		createColleagues();
		
		//radio 추가
		add(checkGuest); 
		add(checkLogin);
		add(checkMember);
		
		//lable 과 textField 추가
		add(new Label("Username:"));
		add(textUser);
		add(new Label(""));
		add(new Label("Password:"));
		add(textPass);
		add(new Label(""));
		add(new Label("Number:"));
		add(textNumber);
		add(new Label(""));
		
		//버튼추가
		add(buttonOk);
		add(buttonCancle);
		
		colleagueChanged();
		pack();
		setVisible(true); //show() 대체
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) { //Ok 버튼이나 Cancle 버튼을 클릭하였을 경우
		// TODO Auto-generated method stub
		System.out.println(e.toString());
		System.exit(0);
	}

	public void createColleagues() {
		CheckboxGroup g = new CheckboxGroup();
		checkGuest = new ColleagueCheckbox("Guest", g, true); //게스트용 생성자
		checkLogin = new ColleagueCheckbox("Login", g, false); //로그인 생성자
		checkMember = new ColleagueCheckbox("Member", g, false); //맴버 생성자

		textUser = new ColleagueTextField("", 10);
		textPass = new ColleagueTextField("", 10);
		textPass.setEchoChar('*'); //패스워드 입력시  *로 표시함
		textNumber = new ColleagueTextField("", 13);
		textNumber.setEchoChar('*');
		buttonOk = new ColleagueButton("OK");
		buttonCancle = new ColleagueButton("Cancle");
		
		checkGuest.setMediaior(this);
		checkLogin.setMediaior(this);
		checkMember.setMediaior(this);
		textUser.setMediaior(this);
		textPass.setMediaior(this);
		textNumber.setMediaior(this);
		buttonOk.setMediaior(this);
		buttonCancle.setMediaior(this);
		
		// 이벤트 처리를 하기 위한 addItemListener 핸들
		checkGuest.addItemListener(checkGuest); 
		checkLogin.addItemListener(checkLogin);
		checkMember.addItemListener(checkMember);
		textUser.addTextListener(textUser); // 컴포넌트로 부터 텍스트 이벤트를 받기위해 
		textPass.addTextListener(textPass); 
		textNumber.addTextListener(textNumber);
		buttonOk.addActionListener(this);  // 버튼 클릭 이벤트 처리
		buttonCancle.addActionListener(this); 
		
		
		
	}
	public void colleagueChanged() {
		if(checkGuest.getState()) { //게스트 일때
			textUser.setColleagueEnabled(false);
			textPass.setColleagueEnabled(false);
			textNumber.setColleagueEnabled(false);
			buttonOk.setColleagueEnabled(false);
		}else if(checkMember.getState()) { // 맴버계정일시 계정
			textUser.setColleagueEnabled(true);
			textPass.setColleagueEnabled(true);
			textNumber.setColleagueEnabled(true);
			userpassChanged();
			limit_number();
		}
		else {  
			textUser.setColleagueEnabled(true);
			textPass.setColleagueEnabled(false);
			textNumber.setColleagueEnabled(false);
		
			userpassChanged();
		}
	}
	
	public void limit_number() { //주민드록 13자리를 유지하기 위한 함수
		if(textNumber.getText().length()>13) {
			textNumber.setText(textNumber.getText().substring(0, 13));
		}
	}
	
	public void userpassChanged() { //아이디 필드에 내용이 있는 순간 비밀번호 텍스트 필드 화렁화
		if(textUser.getText().length() > 0 || checkMember.getState()==true) {
			textPass.setColleagueEnabled(true);
			if(textPass.getText().length() > 0 && textNumber.getText().length() >0) { //비밀번호 필드에 내용이 있는 순간 버튼 활성화
				String temp = textNumber.getText();
				if(temp.matches(".*[a-z].*") || temp.matches(".*[A-Z].*") || temp.matches(".* .*")) {  //주민등록번호 필드에 숫자 이외의 값이 있을 경우
					buttonOk.setColleagueEnabled(false);
				}else {
					buttonOk.setColleagueEnabled(true);
				}
			}else {
				buttonOk.setColleagueEnabled(false);
			}
		}else {
			textPass.setColleagueEnabled(false);
			buttonOk.setColleagueEnabled(false);
		}
	}
}
