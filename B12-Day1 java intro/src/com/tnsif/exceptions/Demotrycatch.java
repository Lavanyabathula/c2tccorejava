package com.tnsif.exceptions;
public class Demotrycatch {

	public static void main(String[] args)
	{
		/*int n1=50/0;
		System.out.println(n1);
		System.out.println("welcome");*/

		
       int[] arr= new int[5];
		try
		{
			int a[]=new int[5];
			a[8]=30/4;
			

		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);

		}
		catch(ArithmeticException e)
		{
			System.out.println(e);

		}
		
		finally
		{
       System.out.println("end of block");
		}
		System.out.println("welcome");
		
		/*try{
			   int arr[] ={1,2,3,4,5};
			   System.out.println(arr[7]);
			}
		        catch(ArrayIndexOutOfBoundsException e){
			   System.out.println("The specified index does not exist " +
				"in array. Please correct the error.");
			}*/
	}

}
