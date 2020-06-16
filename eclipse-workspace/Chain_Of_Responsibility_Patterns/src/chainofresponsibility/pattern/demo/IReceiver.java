package chainofresponsibility.pattern.demo;

public interface IReceiver {
	
	public Boolean ProcessMessage(Message msg);
}
