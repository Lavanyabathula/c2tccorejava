
public class Demostatic 
{
    int sid;                      
    String sname;
	static String collegename;
	public static void show()
	{
		System.out.println(collegename);
	}
	public static void main(String[] args)
	{
       Demostatic ob=new Demostatic();
       ob.sid=10;
       ob.sname="joyce";
		System.out.println("The sid is"+ob.sid);
		System.out.println("The sname is"+ob.sname);

       Demostatic.collegename="VIIT";
        Demostatic.show();
	}

}
