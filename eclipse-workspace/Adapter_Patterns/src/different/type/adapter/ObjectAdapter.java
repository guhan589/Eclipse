package different.type.adapter;

public class ObjectAdapter implements llntegerValue {
	public llntegerValue myint;
	public ObjectAdapter(llntegerValue value){
		this.myint = value;
	}
	public int getInteger() {
		return 2+this.myint.getInteger();
	}
}
