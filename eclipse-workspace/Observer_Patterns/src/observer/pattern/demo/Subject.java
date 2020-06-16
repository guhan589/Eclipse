package observer.pattern.demo;

import java.util.*;


public class Subject implements ISubject {

	List<Observer> observerList = new ArrayList<Observer>();
	private int flag;
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	@Override
	public void register(Observer o) {
		observerList.add(o);
	}

	@Override
	public void unrgister(Observer o) {
		observerList.remove(o);
	}

	@Override
	public void notifyObservers() {
		for(int i=0;i<observerList.size();i++) {
			observerList.get(i).update();
		}
	}
	
}
