package Interpreter.pattern.demo;

public class Context {
	public String input;
	public Context(String input) {
		this.input = input;
	}
	public void getBinaryForm(String input) {
		int i = Integer.parseInt(input);//문자열 int정수형으로 변환
		String binaryString = Integer.toBinaryString(i); // 정수 -> binary로 변환
		System.out.println("Binary equivalent of "+input+ " is "+binaryString);
	}
	
	public void printInWords(String input) {
		this.input = input;
		System.out.println("Printing the input in words:");
		char c[] = input.toCharArray(); //String을 문자배열로 변환
		for(int i = 0; i < c.length;i++) {
			switch(c[i]) {
			case '1':
				System.out.println("One");
				break;
			case '2':
				System.out.println("Two");
				break;
			case '3':
				System.out.println("Three");
				break;
			case '4':
				System.out.println("Four");
				break;
			case '5':
				System.out.println("Five");
				break;
			case '6':
				System.out.println("Six");
				break;
			case '7':
				System.out.println("Seven");
				break;
			case '8':
				System.out.println("Eight");
				break;
			case '9':
				System.out.println("Nine");
				break;
			case '0':
				System.out.println("Zero");
				break;
			default:
				System.out.println("*");
				break;
			}
		}
		
	}
}
