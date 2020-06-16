package adapter.pattern.demo;


class Rect{
	public double t, w;
}
class Triangle{
	public double b , h;
	public Triangle(int a, int b) {
		this.b = a;
		this.h = b;
		
	}
}

class Calculator{ //�簢�� ���� Ŭ����
	Rect rectangle;
	public double getArea(Rect rect) { //���޹��� Rect ��ü�� ���ڸ� Rect ��ü ���� rectangle �� �����ϰ� Rect�� t������ w������ ���Ͽ� �� ����� return ����
		rectangle = rect;
		return rectangle.t * rectangle.w;
	}
}
class CalculatorAdapter{
	Calculator calculator;
	Triangle triangle;
	public double getArea(Triangle t) {// Trianle ��ü ������ double �� t,�� h���� Rect ��ü r�� t,w�� ���� �ϰ� �̸� calculator ��ü�� getArea�޼ҵ带 Rect��ü�� ���� �� ȣ��
		calculator = new Calculator();
		
		triangle = t;
		Rect r = new Rect();
		r.t = triangle.b;
		r.w = triangle.h * 0.5;
		return calculator.getArea(r);
	}
}
public class AdapterPattern {
	public static void main(String args[]) {
		System.out.println("***Adapter Pattern Demo***");
		CalculatorAdapter cal = new CalculatorAdapter(); //CalculatorAdapter cal��ü ����
		Triangle t = new Triangle(20, 10); //Triangle t �Ű����� �� ���ڿ� �Բ� ����
		System.out.println("Adapter Pattern Example\n");
		System.out.println("Aeea of Triangle is :"+cal.getArea(t)); //cal.getArea �� ȣ���ϸ鼭 Triangle ��ü t�� ��� �ְ� double�� ��ȯ���� �޾� ���
	}
}

