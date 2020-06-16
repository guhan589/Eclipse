package Observer;
import java.util.*;
public class RandomNumberGenerator extends NumberGenerator {
	private Random random = new Random();
	int number;

	public int getNumber() {
		
		return number;
	}

	public void execute() {
		for(int i = 0; i< 20;i++) {
			number = random.nextInt(50); //0~49까지의 난수를 return
			notifyObservers();
		}
		
	}

}
