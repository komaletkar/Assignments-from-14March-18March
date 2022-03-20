package javaFundamentals;

class Dog5
{
    private String name;

    public Dog5(String name)
    {
        this.name = name;
    }

    public boolean equals(String name)
    {
       if(name==name) {
    	   return true;
       }else 
    	   return false;
    }

}

public class March17_ModifyCode {

    public static void main(String[] args)
    {
        Dog5 d1 = new Dog5("Rufus");
        Dog5 d2 = new Dog5("Sally");
        Dog5 d3 = new Dog5("Rufus");
        Dog5 d4 = new Dog5("Rufus");
        d1=d2;
        d2=d3;
        d1=d3;
        d3=d4;
        System.out.println("Dog ::");
        System.out.println(d2.equals(d3));
        System.out.println(d1.equals(d3));
        System.out.println(d1.equals(d2));
        System.out.println(d3.equals(d4));
    }
}
