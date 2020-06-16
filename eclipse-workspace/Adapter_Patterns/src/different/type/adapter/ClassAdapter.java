package different.type.adapter;

public class ClassAdapter extends IntegerValue{
	public int getInteger() {
		return 2+ super.getInteger();
	}
}
