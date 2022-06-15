
public class ctrlstmt {

	public static void main(String[] args)
	{
//to check the number is even or odd
   /* int x=3;
    if(x%2==0)
    {
    	System.out.println("The given number is even");
    }
    else
    {
    	System.out.println("The given number is odd");

    }
	}*/
	
		//to check the number is positive or negative
		
	/*	int x=0;
		if(x>0)
		{
			System.out.println("The given number is positive");
		}
		else if(x<0)
		{
			System.out.println("The given number is negative");
		}
		else
		{
			System.out.println("The given number is zero");
		}*/
		
	//to check given number is both positive and even	
		int x=-4;
		if(x>0)
		{
			if(x%2==0)
			{
				System.out.println("The given number is positive and even");
			}
			else
			{
				System.out.println("The given number is positive but not even");
			}
		}
		else
		{
			System.out.println("The given number is negative");
		}
		
	}

}
