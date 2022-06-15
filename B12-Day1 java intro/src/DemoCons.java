
public class DemoCons {
	
	int num,num1,num2;//instance variable
     public DemoCons()
     {
    	 num=7;
     }
     public DemoCons(int num,int num1)
     {
    	this.num=num;
    	this.num1=num1;
     }
     public DemoCons(int n,int j,int k)//local variable
     { 
    	 num=n;
    	 num1=j;
    	 num2=k;
     }
	public static void main(String[] args) 
	{
     DemoCons obj=new DemoCons(7,9);
     System.out.println("the value of num"+obj.num);
     System.out.println("the value of num1"+obj.num1);
     System.out.println("the value of num2"+obj.num2);

	}

}
