package car;

import java.util.Random;

public abstract class BasicCar implements Cloneable {
	public String modelname;
	public int price;
	
	public String getMOdelname() {
		return modelname;
	}
	public void setModelname(String name) {
		this.modelname = name;
	}
	public static int setPrice() {
		int price = 0;
		Random r = new Random();
		int p = r.nextInt(10000);
		price = p;
		return price;
	}
	public BasicCar clone()throws CloneNotSupportedException{
		return (BasicCar)super.clone(); 
	}
}
