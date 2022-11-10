import java.util.Scanner;
class MaxNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of an array");
		int size=sc.nextInt();
		System.out.println("Enter the array numbers");
		int arr[]=new int[size];
		for (int i=0;i<size ;i++ )
		{
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int index=0;
		for (int i=0;i<size ;i++ )
		{
			if (max<arr[i])
			{
				max=arr[i];
				index=i;
			}
		}
		System.out.println("the maximum number is "+max);
		System.out.println("the index of the number is "+index);
	}
}
