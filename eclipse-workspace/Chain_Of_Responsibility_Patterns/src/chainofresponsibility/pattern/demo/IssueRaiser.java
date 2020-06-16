package chainofresponsibility.pattern.demo;

public class IssueRaiser {
	public IReceiver setFirstReciver;
	public IssueRaiser(IReceiver iReceiver) {
		this.setFirstReciver = iReceiver;
	}
	public void RaiseMessage(Message msg) {
		if(setFirstReciver != null)
			setFirstReciver.ProcessMessage(msg);
	}
}
