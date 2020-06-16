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
		
		//radio �߰�
		add(checkGuest); 
		add(checkLogin);
		add(checkMember);
		
		//lable �� textField �߰�
		add(new Label("Username:"));
		add(textUser);
		add(new Label(""));
		add(new Label("Password:"));
		add(textPass);
		add(new Label(""));
		add(new Label("Number:"));
		add(textNumber);
		add(new Label(""));
		
		//��ư�߰�
		add(buttonOk);
		add(buttonCancle);
		
		colleagueChanged();
		pack();
		setVisible(true); //show() ��ü
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) { //Ok ��ư�̳� Cancle ��ư�� Ŭ���Ͽ��� ���
		// TODO Auto-generated method stub
		System.out.println(e.toString());
		System.exit(0);
	}

	public void createColleagues() {
		CheckboxGroup g = new CheckboxGroup();
		checkGuest = new ColleagueCheckbox("Guest", g, true); //�Խ�Ʈ�� ������
		checkLogin = new ColleagueCheckbox("Login", g, false); //�α��� ������
		checkMember = new ColleagueCheckbox("Member", g, false); //�ɹ� ������

		textUser = new ColleagueTextField("", 10);
		textPass = new ColleagueTextField("", 10);
		textPass.setEchoChar('*'); //�н����� �Է½�  *�� ǥ����
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
		
		// �̺�Ʈ ó���� �ϱ� ���� addItemListener �ڵ�
		checkGuest.addItemListener(checkGuest); 
		checkLogin.addItemListener(checkLogin);
		checkMember.addItemListener(checkMember);
		textUser.addTextListener(textUser); // ������Ʈ�� ���� �ؽ�Ʈ �̺�Ʈ�� �ޱ����� 
		textPass.addTextListener(textPass); 
		textNumber.addTextListener(textNumber);
		buttonOk.addActionListener(this);  // ��ư Ŭ�� �̺�Ʈ ó��
		buttonCancle.addActionListener(this); 
		
		
		
	}
	public void colleagueChanged() {
		if(checkGuest.getState()) { //�Խ�Ʈ �϶�
			textUser.setColleagueEnabled(false);
			textPass.setColleagueEnabled(false);
			textNumber.setColleagueEnabled(false);
			buttonOk.setColleagueEnabled(false);
		}else if(checkMember.getState()) { // �ɹ������Ͻ� ����
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
	
	public void limit_number() { //�ֹε�� 13�ڸ��� �����ϱ� ���� �Լ�
		if(textNumber.getText().length()>13) {
			textNumber.setText(textNumber.getText().substring(0, 13));
		}
	}
	
	public void userpassChanged() { //���̵� �ʵ忡 ������ �ִ� ���� ��й�ȣ �ؽ�Ʈ �ʵ� ȭ��ȭ
		if(textUser.getText().length() > 0 || checkMember.getState()==true) {
			textPass.setColleagueEnabled(true);
			if(textPass.getText().length() > 0 && textNumber.getText().length() >0) { //��й�ȣ �ʵ忡 ������ �ִ� ���� ��ư Ȱ��ȭ
				String temp = textNumber.getText();
				if(temp.matches(".*[a-z].*") || temp.matches(".*[A-Z].*") || temp.matches(".* .*")) {  //�ֹε�Ϲ�ȣ �ʵ忡 ���� �̿��� ���� ���� ���
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
