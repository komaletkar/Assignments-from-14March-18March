package javaFundamentals;

abstract class Book {
	String title;

	abstract void setTitle(String s);

	String getTitle() {
		return title;
	}
}

class Mybook extends Book {
	void setTitle(String Title) {
		this.title=Title;
}}
public class March17_AbstractUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mybook b1 = new Mybook();
		b1.setTitle("A tale of two cities");
		System.out.println(" The title is :"+b1.getTitle());
	}
	

}