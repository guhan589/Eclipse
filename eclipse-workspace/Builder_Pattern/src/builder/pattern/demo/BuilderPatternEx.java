package builder.pattern.demo;

public class BuilderPatternEx {
	public static void main(String args[]) {
		System.out.println("***Builder Pattern Demo***\n");
		Director director = new Director();
		IBuilder carBuilder = new Car();
		IBuilder motorBuilder = new MotorCycle();
		director.Construct(carBuilder);
		Product p1 = carBuilder.GetVehicle(); //carBuilder¿¡ addÇÑ product °´Ã¼¸¦ °¡Á®¿È
		p1.Show();
		director.Construct(motorBuilder);
		Product p2 = motorBuilder.GetVehicle();//motorBuilder¿¡ addÇÑ product °´Ã¼¸¦ °¡Á®¿È
		p2.Show();
	}
}
