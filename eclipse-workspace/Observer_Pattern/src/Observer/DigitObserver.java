package Observer;

public class DigitObserver implements Observer{

	@Override
	public void update(NumberGenerator generator) {
		System.out.println("DigitObserver:"+generator.getNumber());
		try {
			Thread.sleep(100);//������ �ӵ� 100ms ����
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
