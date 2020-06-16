package chainofresponsibility.pattern.demo;

public class FaxErrorHandler implements IReceiver{

	
	private IReceiver ireceiver;
	public FaxErrorHandler(IReceiver nextReceiver) {
		this.ireceiver = nextReceiver;
	}
	
	@Override
	public Boolean ProcessMessage(Message msg) {
		if(msg.Text.contains("Fax")) {
			System.out.println("FaxErrorHandler processed "+msg.priority+" priority issue:"+msg.Text);
			return true;
		}else {
			if(ireceiver != null) {
				ireceiver.ProcessMessage(msg);
			}
		}
		return false;
	}

}
