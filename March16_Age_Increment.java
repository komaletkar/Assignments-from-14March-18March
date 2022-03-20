package javaFundamentals;

class Human{
	static int Age=9;
	
 static void Age_Increment() {
	Age=Age+1;
	System.out.println("Age " + " = " + Age);
}}

public class March16_Age_Increment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Human h1=new Human();
h1. Age_Increment();
	}

}
