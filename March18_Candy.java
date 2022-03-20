package javaFundamentals;

class Candy {
	public String taste() {
		return "tastes sweet!";
	}

}

class Chocolate extends Candy {

	public String taste() {
		return "tastes Chocolately";
	}

}

public class March18_Candy {
	public static void main(String[] args)
    	    {
    	        Candy c1 = new Candy();
    	        System.out.println(c1.taste());
    	        Candy c2 = new Chocolate();
    	        System.out.println(c2.taste());
    	    }
}
