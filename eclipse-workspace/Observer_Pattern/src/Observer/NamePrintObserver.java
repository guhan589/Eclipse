package Observer;

public class NamePrintObserver implements Observer{
	String name;
	public NamePrintObserver(String name) {
		this.name = name;
	}
	public void update(NumberGenerator generator) {
		int count = generator.getNumber();
		for(int i= 0 ; i < count;i++) {
			System.out.print(name+" ");
		}
		System.out.println("");
		try {
			Thread.sleep(100);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
