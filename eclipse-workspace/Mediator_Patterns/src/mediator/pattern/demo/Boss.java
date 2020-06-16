package mediator.pattern.demo;

public class Boss extends Friend{
	//private Mediator mediator;
	private String name;
	public Boss(Mediator mediator,String name) {
		super(mediator);
		this.name = name;
	}
	
	public void Send(String msg) {
		mediator.Send(this, msg);
	}
	public void noticfy(String msg) {
		System.out.println("\n Boss sees message: "+msg);
		System.out.println("");
	}

}
