
public class ArrDemo
{

	public static void main(String[] args) 
	{
      /* int arr[]=new int[4]; //array syntax
       arr[0]=10; //assign values
       arr[1]=20;
       arr[2]=30;
       arr[3]=40;
       
      for(int i=0;i<4;i++)
       {
           System.out.println(arr[i]);

       }
       /*for(int i:arr)
       {
           System.out.println(i);

       }*/
		
	int a[]= {1,2,3,4};
	int b[]= {5,6};
	int c[]= {7,8,9,0,7};
	int d[][]= {a,b,c};
	   
   for(int i=0;i<d.length;i++)
   {
	   for(int j=0;j<d[i].length;j++)
	   {
		   System.out.print(""+d[i][j]);
	   }
	   System.out.println();
   }
	
	}
		
	}


