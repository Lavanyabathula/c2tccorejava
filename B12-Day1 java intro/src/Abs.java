 abstract class Animal
{  //can hv abstract methods & non-abstract methods
	 // Abstract class must have abstract methods
	 // Abstract class cannot be instainted
	abstract void noise();
     public void eat()
     {
 		System.out.println("Every animal eats");
     }
}
public class Abs extends Animal 
{
	public void noise()
	{
		System.out.println("The dog barks");
	}

	public static void main(String[] args) 
	{
        Abs obj=new Abs();
        obj.eat();
        obj.noise();

	}

}
