package javaFundamentals;

class Bike{
	String name;
	String model;
	int avarage;
	int price;
	int warranty;
	 Bike(){
		 
	 }
		public String toString() {
			return ("name:: " + this.name + "\n" + "model:: " + this.model + "\n" + "avarage:: " + avarage + "\n"
					+ "price:: " + this.price + "Lakh" + "\n" + "warramty:: " + this.warranty + "yrs");
		}
	}
class March_14_Instance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b1=new Bike();
		System.out.println(b1);

	}
}