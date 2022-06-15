class Parent
{
	public void add(int x,int y)
	{
		System.out.println("The sum is"+(x+y));
	}
}
public class DemoInh extends Parent{

	public static void main(String[] args)
	{
       DemoInh obj=new DemoInh();
       obj.add(5, 4);

	}

}
