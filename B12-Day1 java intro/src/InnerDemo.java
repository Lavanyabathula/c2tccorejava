class outer
{
	void show()
	{
		System.out.println("outer class");
	}
 static class inner
    {
		void display()
		{
			System.out.println("inner class");

		}
	}
}

public class InnerDemo 
{
	public static void main(String[] args)
	{
		outer ob=new outer();
		ob.show();
		
		outer.inner obj=new outer.inner();
		obj.display();
       
	}

}
