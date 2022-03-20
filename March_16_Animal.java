package javaFundamentals;

class Animal1 {
	int legs1=4;
	int mouth=1;
	int tail=1;
	int speed;


	public void eat1() {
		System.out.println("I eat");
	}

	public void walk1() {
		System.out.println("I walk");
	}
}

class Cow1 extends Animal1 {
	int Speed1=10;
	public void Milk() {
		System.out.println("I give milk");
	}
	public void Weight() {
		System.out.println("I am less than an elephant by weight");
	}
}
class Dog10 extends Animal1 {

	public void bark() {
		System.out.println("Dog bark");
	}
	public void Weight() {
		System.out.println("I am less than an cow by weight");
	}}
	class Elephant extends Animal1 {

		public void Trunk() {
			System.out.println("I have trunk ");
		}
		public void Weight() {
			System.out.println("I am fattest of all");
		}}
public class March_16_Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int speed=10;
		int speed1=50;
		int speed2=3;
		System.out.println("--------------Animal------------");
		Animal1 a1=new Animal1();
		a1.eat1();
		a1.walk1();
		System.out.println("I have " + a1.legs1 + " legs");
		System.out.println("My speed is " + a1.speed);
		System.out.println("--------------Cow------------");
		Cow1 c1=new Cow1();
		c1.eat1();
		c1.walk1();
		System.out.println("I have " + c1.legs1 + " legs");
		System.out.println("My speed is " + speed+"km/hr");
		c1.Weight();
		System.out.println("--------------Dog------------");
		Dog10 d1=new Dog10();
		d1.eat1();
		d1.walk1();
		System.out.println("I have " + d1.legs1 + " legs");
		System.out.println("My speed is " + speed1+"km/hr");
		d1.Weight();
		System.out.println("--------------Elephant------------");
		Elephant e1=new Elephant();
		e1.eat1();
		e1.walk1();
		System.out.println("I have " + e1.legs1 + " legs");
		System.out.println("My speed is " + speed2+"km/hr");
		e1.Weight();
	}

}