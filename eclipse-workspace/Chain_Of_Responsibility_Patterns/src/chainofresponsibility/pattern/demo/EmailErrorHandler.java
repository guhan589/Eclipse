package chainofresponsibility.pattern.demo;

public class EmailErrorHandler implements IReceiver{
	private IReceiver ireceiver;
	public EmailErrorHandler(IReceiver ireceiver) {
		this.ireceiver = ireceiver;
	}
	@Override
	public Boolean ProcessMessage(Message msg) {
		if(msg.Text.contains("Email")) {
			System.out.println("EmailErrorHandler processed "+msg.priority+" priority issue:"+msg.Text);
			return true;
		}else {
			if(ireceiver != null) {
				ireceiver.ProcessMessage(msg);
			}
		}
		return false;
	}

}
