package car;

public class Nano extends BasicCar {
	public Nano(String str) {
		modelname = str;
	}
	public BasicCar clone()throws CloneNotSupportedException{
		return (Nano) super.clone();
	}
}
