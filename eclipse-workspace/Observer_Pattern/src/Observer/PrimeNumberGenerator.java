package Observer;
import java.util.*;
public class PrimeNumberGenerator extends NumberGenerator{
	Random random = new Random();

	private int number;
	@Override
	public int getNumber() {
		
		return number;
	}

	@Override
	public void execute() {
		while(true) {
			int count =0;
			number = (int) ((Math.random()*50)+1);
			if(number==0||number==1) {
				count++;
			}else {
				for(int i = 2; i< number;i++) {
					if(number % i ==0 ) { //�Ҽ��� 1�� �ڱ��ڽ� �ܿ� ���� ������ ��������� �Ҽ��� �ƴϴ�
						count++;
					}
				}
				
			}
			
			if(count==0)
				break;
			
		}
		notifyObservers();
		
	}

}
