package builder.pattern.demo;

public class BuilderPatternEx {
	public static void main(String args[]) {
		System.out.println("***Builder Pattern Demo***\n");
		Director director = new Director();
		IBuilder carBuilder = new Car();
		IBuilder motorBuilder = new MotorCycle();
		director.Construct(carBuilder);
		Product p1 = carBuilder.GetVehicle(); //carBuilder�� add�� product ��ü�� ������
		p1.Show();
		director.Construct(motorBuilder);
		Product p2 = motorBuilder.GetVehicle();//motorBuilder�� add�� product ��ü�� ������
		p2.Show();
	}
}
