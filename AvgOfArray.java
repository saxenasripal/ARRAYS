import java.util.Scanner;
class AvgOfArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		System.out.println("Enter the elements in array");
		int arr[]=new int[size];
		for (int i=0;i<size ;i++ )
		{
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for (int i=0;i<size ;i++ )
		{
			sum=sum+arr[i];
		}
		int avg=sum/size;
		System.out.println("average of the array is "+avg);
	}
}
