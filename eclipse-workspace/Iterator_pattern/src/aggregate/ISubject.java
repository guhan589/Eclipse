package aggregate;


import iterator.IIterator;

public interface ISubject {
	public IIterator CreateIterator();
}
