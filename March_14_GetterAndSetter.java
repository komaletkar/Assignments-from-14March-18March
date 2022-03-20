package javaFundamentals;
	class Vehicle2 {
		String name;
		String model;
		int avarage;
		int price;
		int warranty;

		
		public String getname() {
			return this.name;
		}

		public String getmodel() {
			return this.model;
		}

		public int getavarage() {
			return this.avarage;
		}
		public int getprice() {
			return this.avarage;
		}
		public int getwarranty() {
			return this.avarage;
		}

		public void setname(String name) {
			this.name = name;
		}

		public void setmodel(String model) {
			this.model = model;
		}

		public void setavarage(int avarage) {
			this.avarage = avarage;
		}
		public void setprice(int price) {
			this.price = price;
		}
		public void setwarranty(int warranty) {
			this.warranty = warranty;
		}

	}

	public class March_14_GetterAndSetter {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Vehicle2 v1=new Vehicle2();
			v1.setname("car");
			v1.setmodel("XUV500");
			v1.setavarage(12);
			v1.setprice(15);
			v1.setwarranty(5);
			Vehicle2 v2=new Vehicle2();
			v2.setname("Bike");
			v2.setmodel("pulsar200");
			v2.setavarage(30);
			v2.setprice(1);
			v2.setwarranty(3);
			Vehicle2 v3=new Vehicle2();
			v3.setname("Truck");
			v3.setmodel("Eicher");
			v3.setavarage(40);
			v3.setprice(25);
			v3.setwarranty(7);
			System.out.println("All information about car ::");
			System.out.println(v1.name);
			System.out.println(v1.model);
			System.out.println(v1.avarage);
			System.out.println(v1.price);
			System.out.println(v1.warranty);
			System.out.println();
			System.out.println("All information about Bike::");
			System.out.println(v2.name);
			System.out.println(v2.model);
			System.out.println(v2.avarage);
			System.out.println(v2.price);
			System.out.println(v2.warranty);
			System.out.println();
			System.out.println("All information about Truck ::");
			System.out.println(v3.name);
			System.out.println(v3.model);
			System.out.println(v3.avarage);
			System.out.println(v3.price);
			System.out.println(v3.warranty);
			
		}

	}


