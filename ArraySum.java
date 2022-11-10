import java.util.Scanner;
class ArraySum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the elements in an array");
		for (int i=0;i<size ;i++ )
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		for (int i=0;i<size ;i++ )
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
}
