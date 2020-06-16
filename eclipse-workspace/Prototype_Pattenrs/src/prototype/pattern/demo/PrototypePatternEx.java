package prototype.pattern.demo;

import car.*;
public class PrototypePatternEx {
	public static void main(String args[]) throws CloneNotSupportedException{
		System.out.println("***Prototype Pattern Demo***\n");
		BasicCar nano_base = new Nano("Green Nano");
		nano_base.price=100000;
		
		BasicCar ford_basic = new Ford("Ford Yellow");
		ford_basic.price=500000;
		
		BasicCar bc1; //인스턴스를 복제하기 위한 객체 선언
		bc1 =nano_base.clone(); //clone 이란 복제가 가능하다의 의미를가지고 있다, 
		bc1.price = nano_base.price+BasicCar.setPrice(); //사전에 설정한 price(100000)와 setPrice의 랜덤 값과 더함 
		System.out.println("Car is: "+ bc1.modelname+" and it's price is Rs."+bc1.price);
		bc1 =ford_basic.clone();
		bc1.price = ford_basic.price+BasicCar.setPrice();//사전에 설정한 price(200000)와 setPrice의 랜덤 값과 더함 
		System.out.println("Car is: "+ bc1.modelname+" and it's price is Rs."+bc1.price);
	}
}
