package mediator.pattern.demo;

public class MediatorPatternEx {
	public static void main(String[] args) {
		System.out.println("***Meidator Pattern Demo***\n");
		ConcreateMediator m = new ConcreateMediator();

		Friend1 Amit = new Friend1(m, "Amit");
		
		Friend2 Sohel = new Friend2(m, "Sohel");
		
		Boss Raghu = new Boss(m, "Raghu");
		
		m.setFriend1(Amit);
		m.setFriend2(Sohel);
		m.setBoss(Raghu);
		
		Amit.Send("[Amit here]Good Morrning. Can we discuss the meditator pattern?");
		
		Sohel.Send("[Sohel here]Good Morrning. Yes, we can discuss now");
		
		Raghu.Send("[Raghu here]:Please get back to work quickly");
	}
	
}
