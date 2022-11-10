import java.util.Scanner;
class MinWord
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of a array");
		int size=sc.nextInt();
		String arr[]=new String[size];
		System.out.println("enter the data into the array");
		for (int i=0;i<size ;i++ )
		{
			arr[i]=sc.next();
		}
		int min=arr[0].length();
		int index=0;
		for (int i=0;i<size;i++ )
		{
			int len=arr[i].length();
			if (min>len)
			{
				min=len;
				index=i;
			}
		}
		System.out.println(arr[index]);
		System.out.println(index);
	}
}
