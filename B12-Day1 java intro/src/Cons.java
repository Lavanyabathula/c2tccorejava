class Demo
{
	int num;
/*	public Demo() 
	{
	  num=5;
      
    System.out.println("in constructor"+num);

	}*/
	public Demo(int num)
	{
		 this.num=num;
	}

}
public class Cons {

		public static void main(String[] args)
	{

Demo obj=new Demo(7);
System.out.println(obj.num);

	}

}
