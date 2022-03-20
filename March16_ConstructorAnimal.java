package javaFundamentals;

class Animals {
	int tail, mouth, legs;

	Animals() {
		
	}

	Animals(int legs, int tail) {
		this.legs = legs;
		this.tail = tail;

	}

	Animals(int legs, int tail, int mouth) {
		this.legs = legs;
		this.tail = tail;
		this.mouth = mouth;

	}
}

public class March16_ConstructorAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------------Animal------------");
		Animals a1 = new Animals();
		Animals a2 = new Animals(4, 1);
		Animals a3 = new Animals(4, 1, 1);
		System.out.println(a1);
		System.out.println("Usually animals have " + a2.legs + " " + "Usually animals have " + a2.tail);
		System.out.println("Usually animals have " + a3.legs + "Usually animals have " + a3.tail
				+ "Usually animals have" + a3.mouth);

	}

}
