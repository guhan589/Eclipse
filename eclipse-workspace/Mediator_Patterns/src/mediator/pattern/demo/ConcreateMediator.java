package mediator.pattern.demo;

public class ConcreateMediator extends Mediator{

	private Friend1 friend1;
	private Friend2 friend2;
	private Boss boss;
	
	public void setFriend1(Friend1 friend1) {
		this.friend1 = friend1;
	}
	public void setFriend2(Friend2 friend2) {
		this.friend2 = friend2;
	}
	public void setBoss(Boss boss) {
		this.boss = boss;
		
	}
	
	
	@Override
	public void Send(Friend friend, String msg) {
		if(friend == friend1) {
			friend2.Notify(msg);
			boss.noticfy(friend1.name + " sened message to " + friend2.name);
		}
		
		if(friend == friend2) {
			friend1.Notify(msg);
			boss.noticfy(friend2.name + " sened message to " + friend1.name);
		}
		if(friend==boss) {
			friend1.Notify(msg);
			friend2.Notify(msg);
		}
		
	}

}
