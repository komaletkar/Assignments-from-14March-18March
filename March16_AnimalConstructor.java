package javaFundamentals;

class Animal {
	int legs;
	int mouth;
	int tail;
	int speed;

	Animal(int legs, int mouth, int tail) {
		System.out.println("In Animal Constructor");
		this.legs = 4;
		this.mouth = mouth;
		this.tail = tail;
		this.speed = 100;
	}

	public void eat() {
		System.out.println("I eat");
	}

	public void walk() {
		System.out.println("I walk");
	}
}

class Cow extends Animal {
	Cow() {
		super(0, 0, 0);
		this.speed = 5;
	}

	public void Milk() {
		System.out.println("I give milk");
	}
}

class Dog extends Animal {
	String bark;

	Dog(String bark, int legs, int mouth, int tail) {
		super(legs, mouth, tail);
		this.speed = 90;

		System.out.println("In Dog Constructor");
	}

	public void bark() {
		System.out.println("Dog bark");
	}
}

class Puppy extends Dog {

	Puppy(int speed, String bark, int legs, int mouth, int tail) {
		super(bark, legs, mouth, tail);
		this.speed = 10;
		System.out.println("In Puupy Constructor");
	}

	public void bark() {
		System.out.println("Puppy bark");
	}
}

public class March16_AnimalConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method
		System.out.println("--------------Animal------------");
		Animal a1 = new Animal(0, 0, 0);
		a1.eat();
		a1.walk();
		System.out.println("I have " + a1.legs + " legs");
		System.out.println("My speed is " + a1.speed);
		System.out.println("--------------Dog---------------");
		Dog d1 = new Dog("", 0, 0, 0);
		d1.bark();
		d1.eat();
		d1.walk();
		System.out.println("I have " + d1.legs + " legs");
		System.out.println("My speed is " + d1.speed);
		System.out.println("--------------Puupy--------------");
		Puppy p1 = new Puppy(0, "", 0, 0, 0);
		p1.bark();
		p1.eat();
		p1.walk();
		System.out.println("I have " + p1.legs + " legs");
		System.out.println("My speed is " + p1.speed);
		System.out.println("--------------Cow--------------");
		Cow c1 = new Cow();
		c1.eat();
		c1.walk();
		c1.Milk();
		System.out.println("I have " + c1.legs + " legs");
		System.out.println("My speed is " + c1.speed);

	}

}