class Department
{
	int deptid;
	String deptname;
}
class CSE extends Department
{
	int totalintake=120;
}
class MCA extends Department
{
	int totalintake=60;
}
class It extends Department
{
	int totalintake=60;
}
public class HirInh 
{

	public static void main(String[] args) 
	{
      CSE obj=new CSE();
      MCA ob=new MCA();
      It obj1=new It();
      
      System.out.println(obj.deptid=101);
      System.out.println(obj.deptname="CSE");
      System.out.println(obj.totalintake);
      
      System.out.println(obj1.totalintake);

       if(obj instanceof CSE)
       {
    	   System.out.println("Yes obj is instanceof cse");
       }
       else
       {
    	   System.out.println("no obj is instanceof cse");

       }


	}

}
