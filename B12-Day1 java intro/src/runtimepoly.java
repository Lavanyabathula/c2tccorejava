class runpoly
{
	public void show()
	{
		System.out.println("This is parent class");
	}
}
public class runtimepoly extends runpoly
{
	public void show()
	{
		System.out.println("This is child class");
		super.show();

	}

	public static void main(String[] args)
	{
       runtimepoly obj1 =new runtimepoly();
	   //runpoly obj=new runpoly();
       // obj.show();
        obj1.show();

	}

}
