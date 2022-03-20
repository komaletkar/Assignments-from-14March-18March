package javaFundamentals;

	class Vehicle {
		String name;
		String model;
		int avarage;
		int price;
		int warranty;
	}

	public class March_14_Vehical {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Vehicle v1 = new Vehicle();
			v1.name = "car";
			v1.model="XUV500"; 
			v1.avarage = 12;
			v1.price = 15;
			v1.warranty = 5;
			Vehicle v2 = new Vehicle();
			v2.name = "Bike";
			v2.model="Pulsar200";
			v2.avarage = 30;
			v2.price = 1;
			v2.warranty = 3;
			Vehicle v3 = new Vehicle();
			v3.name = "Truck";
			v3.model="Eicher";
			v3.avarage = 40;
			v3.price = 35;
			v3.warranty = 7;
			System.out.println("Vehical name::"+v1.name);
			System.out.println("Vehical model::"+v1.model);
			System.out.println("Vehical average::"+v1.avarage);
			System.out.println("Vehical price::"+v1.price+"Lakh");
			System.out.println("Vehical warranty::"+v1.warranty);
			System.out.println();
			System.out.println("Vehical name::"+v2.name);
			System.out.println("Vehical model::"+v2.model);
			System.out.println("Vehical average::"+v2.avarage);
			System.out.println("Vehical price::"+v2.price+"Lakh");
			System.out.println("Vehical warranty::"+v2.warranty);
			System.out.println();
			System.out.println("Vehical name::"+v3.name);
			System.out.println("Vehical model::"+v3.model);
			System.out.println("Vehical average::"+v3.avarage);
			System.out.println("Vehical price::"+v3.price+"Lakh");
			System.out.println("Vehical warranty::"+v3.warranty);
		}

	
}
