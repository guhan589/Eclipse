package chainofresponsibility.pattern.demo;


enum MessagePriority{
	Normal,
	High
}

public class Message {
	public String Text;
	public MessagePriority priority;
	public Message(String meg, MessagePriority priority) {
		Text = meg;
		this.priority = priority;
	}
}
