class Final
{
	final public void show()
    {
   System.out.println("with final");
    }
	
}
public class DemoFinal extends Final
{
	final public int i=19;
    public void show1()
    {
   System.out.println("without final");
    }

	public static void main(String[] args)
	{
       DemoFinal obj=new DemoFinal();
       System.out.println(obj.i);
        obj.show();
        obj.show1();
	}

}
