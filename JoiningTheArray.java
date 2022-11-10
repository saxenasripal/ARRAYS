import java.util.Scanner;
class JoiningTheArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the first array");
		int size1=sc.nextInt();
		String arr1[]=new String[size1];
		System.out.println("Enter the elements in an array");
		for (int i=0;i<size1 ;i++ )
		{
			arr1[i]=sc.next();
		}
		System.out.println("Enter the size of an array");
		int size2=sc.nextInt();
		System.out.println("enter the Elements in an array");
		String arr2[]=new String[size2]; 
		for(int i=0;i<size2;i++)
		{
			arr2[i]=sc.next();
		}
		int size3=arr1.length+arr2.length;
		String arr3[]=new String[size3];
		for (int i=0;i<size1;i++)
		{
			arr3[i]=arr1[i];
		}
		for (int i=size1;i<size3 ;i++ )
		{
			arr3[i]=arr2[i-size1];
		}
		for (int i=0;i<arr3.length ;i++ )
		{
			System.out.println(arr3[i]);
		}
	}
}
