import java.util.Scanner;
class SecondLargest 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of an array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements in array");
		for (int i=0;i<size ;i++ )
		{
			arr[i]=sc.nextInt();
		}
		int large=arr[0];
		int secondLargest=-1;
		for (int i=0;i<size ;i++ )
		{
			if (large<arr[i])
			{
				secondLargest=large;
				large=arr[i];
			}
			else if (arr[i]!=large)
			{
				if (secondLargest==-1||arr[i]>secondLargest)
				{
					secondLargest=arr[i];
				}
			}
		}
		System.out.println("the second largest number "+secondLargest);
	}
}
