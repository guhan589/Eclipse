package singleton.pattern.demo;

public class MakeACaptain {
	private static MakeACaptain _captiain;
	private MakeACaptain() {
		
	}
	public static MakeACaptain getCaptain() {
		if(_captiain == null) {
			_captiain = new MakeACaptain();
			System.out.println("New Captain selected for our team");
		}else {
			System.out.println("You already have a Captainfor your team.");
			System.out.println("Send him for the toss.");
		}
		return _captiain;	
	}
}
