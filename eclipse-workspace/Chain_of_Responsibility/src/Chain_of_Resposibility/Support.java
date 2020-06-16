package Chain_of_Resposibility;

public abstract class Support {
	public String name;
	public Support next;
	
	public Support(String name) {
		this.name = name;
	}
	public Support setNext(Support next) {
		this.next = next;
		return next;
	}
	public final void support(Trouble trouble) {
		if(resolve(trouble)) {
			done(trouble);
		}else if(next!=null) {
			next.support(trouble);
		}else {
			fail(trouble);
		}
	}
	protected abstract boolean resolve(Trouble trouble);
	protected void done(Trouble trouble) {
		System.out.println(trouble+"is resolved by"+this+".");
	}
	protected void fail(Trouble trouble) {
		System.out.println(trouble + "can not be resolved");
	}
	public String toString() {
		return "["+name+"]";
	}
}
