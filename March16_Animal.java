package javaFundamentals;

class Animal2 {
	int legs = 4;
	int mouth = 1;

	public void eat() {
		System.out.println("I eat");
	}

	public void tail() {
		System.out.println("I have 1 tail");
	}

	public void walk() {
		System.out.println("I walk");
	}
}

public class March16_Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------------Animal------------");
		Animal2 a1 = new Animal2();
		a1.eat();
		a1.walk();
		a1.tail();
		System.out.println("Usually animals have " + a1.legs + " legs");
		System.out.println("Animals have " + a1.mouth + " mouth");
	}

}