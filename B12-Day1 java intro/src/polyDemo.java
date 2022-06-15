
public class polyDemo
{
  public void add(int x,int y)
  {
	  System.out.println("The sum is"+(x+y));
  }
  public void add(int x,int y,int z)
  {
	  System.out.println("The sum is"+(x+y+z));
  }
  public void add(int x,int y,int z,int a)
  {
	  System.out.println("The sum is"+(x+y+z+a));
  }
	
	public static void main(String[] args) 
	{
       polyDemo obj=new polyDemo();
       obj.add(3, 4);
       obj.add(5, 5, 5);
       obj.add(4, 6, 6, 4);

	}

}
