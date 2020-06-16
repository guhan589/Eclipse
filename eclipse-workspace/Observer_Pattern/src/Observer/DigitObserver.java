package Observer;

public class DigitObserver implements Observer{

	@Override
	public void update(NumberGenerator generator) {
		System.out.println("DigitObserver:"+generator.getNumber());
		try {
			Thread.sleep(100);//스레드 속드 100ms 지연
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
