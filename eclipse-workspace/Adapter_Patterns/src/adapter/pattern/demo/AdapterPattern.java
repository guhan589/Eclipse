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

class Calculator{ //사각형 연산 클래스
	Rect rectangle;
	public double getArea(Rect rect) { //전달받은 Rect 객체의 인자를 Rect 객체 변수 rectangle 에 저장하고 Rect의 t변수와 w변수를 곱하여 이 결과를 return 해줌
		rectangle = rect;
		return rectangle.t * rectangle.w;
	}
}
class CalculatorAdapter{
	Calculator calculator;
	Triangle triangle;
	public double getArea(Triangle t) {// Trianle 객체 인자의 double 형 t,와 h값을 Rect 객체 r의 t,w에 저장 하고 이를 calculator 객체의 getArea메소드를 Rect객체와 전달 및 호출
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
		CalculatorAdapter cal = new CalculatorAdapter(); //CalculatorAdapter cal객체 생성
		Triangle t = new Triangle(20, 10); //Triangle t 매개변수 두 인자와 함께 생성
		System.out.println("Adapter Pattern Example\n");
		System.out.println("Aeea of Triangle is :"+cal.getArea(t)); //cal.getArea 를 호출하면서 Triangle 객체 t를 념겨 주고 double형 반환값을 받아 출력
	}
}

