import java.util.Scanner;
class AverageOfIntegers
{
	public static void main(String[] args) 
	{
	  {
		  int avg=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=scan.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elements in an array");
		for(int i=0;i<size;i++)
		  {
			 a[i]=scan.nextInt();
		  }
		  int sum=0;
		  for (int i=0;i<size;i++ )
		  {
			  sum=sum+a[i];
		  }
		   avg=sum/size;
		  System.out.println("Average of Integers is " +avg);
		  
	  }
	}
}
