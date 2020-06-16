package car;

public class Ford extends BasicCar{
	public Ford(String str) {
		modelname = str;
	}
	public BasicCar clone() throws CloneNotSupportedException{
		return (Ford) super.clone();
	}
}
