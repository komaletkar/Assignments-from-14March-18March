package javaFundamentals;

class CarTruck {
	String name;
	String model;
	int avarage;
	int price;
	int warranty;

	CarTruck( String name, String model, int avarage, int price, int warranty) {
		this.name = "Car";
		this.model = "XUV500";
		this.avarage = 40;
		this.price = 1;
		this.warranty = 3;
		
	}CarTruck( String name,int avarage, int price, int warranty, String model) {
		this.name = "Truck";
		this.model = "Echire";
		this.avarage = 35;
		this.price = 25;
		this.warranty = 5;
	}

	public String toString() {
		return ("name:: " + this.name + "\n" + "model:: " + this.model + "\n" + "avarage:: " + avarage + "\n"
				+ "price:: " + this.price + "Lakh" + "\n" + "warramty:: " + this.warranty + "yrs");
	}
}

public class March_14_VehicalConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarTruck v1 = new CarTruck("","",0,0,0);
		CarTruck v2 = new CarTruck("",0,0,0,"");
		System.out.println(v1);
		System.out.println();
		System.out.println(v2);
	}

}
