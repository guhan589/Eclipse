package chainofresponsibility.pattern.demo;

public class ChainOfResponsibilityPatternEx {
	
	public static void main(String[]args) {
		System.out.println("*** Chain of Responsibility Pattern dEmo***\n");
		IReceiver faxHandler, emailHandler;
	
		
		emailHandler = new EmailErrorHandler(null);
		faxHandler = new FaxErrorHandler(emailHandler);
		
		
		IssueRaiser issueRaiser = new IssueRaiser(faxHandler);
		
		Message m1 = new Message("Fax is reaching late to the destination", MessagePriority.Normal);
		Message m2 = new Message("Email is not going", MessagePriority.High);
		Message m3 = new Message("In Email, BCC field is disabled occasionally", MessagePriority.Normal);
		Message m4 = new Message("Fax is not reaching destination", MessagePriority.High);
		
		issueRaiser.RaiseMessage(m1);
		issueRaiser.RaiseMessage(m2);
		issueRaiser.RaiseMessage(m3);
		issueRaiser.RaiseMessage(m4);
		
	}
}
