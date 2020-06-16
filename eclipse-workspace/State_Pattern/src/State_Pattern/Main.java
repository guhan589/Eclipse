package State_Pattern;

public class Main {
	public static void main(String[] args) {
		SafeFrame safeFrame = new SafeFrame("state Sample");
		
		while(true) {
			for(int hour = 0; hour<24;hour++) {
				safeFrame.setClock(hour);
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
