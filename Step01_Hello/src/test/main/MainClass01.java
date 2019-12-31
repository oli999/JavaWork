package test.main;

import test.mypac.Car;
import test.mypac.Phone;

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("김구라");
		System.out.println("원숭이");
		Car car1=new Car();
		car1.drive();
		System.out.println("주뎅이");
		Phone p1=new Phone();
		p1.call();
		p1.takePicture();
	}
}
