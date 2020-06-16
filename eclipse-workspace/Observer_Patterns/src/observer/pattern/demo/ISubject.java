package observer.pattern.demo;

public interface ISubject {
	void register(Observer o);
	void unrgister(Observer o);
	void notifyObservers();
}