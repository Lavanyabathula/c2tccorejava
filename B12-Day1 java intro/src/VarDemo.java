
public class VarDemo {
	

    int a=10;//instance variable
    int b=20;
    int c=a+b;
    static int e=30;
	public static void main(String[] args)
	{	
	  int d=20;//local variable	
	  VarDemo obj=new VarDemo();
      System.out.println("This is instance variable"+obj.c);
      System.out.println("This is local variable"+d);
      System.out.println("This is static variable"+VarDemo.e);

	}

}
