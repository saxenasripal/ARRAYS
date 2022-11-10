import java.util.Scanner;
class SquareOfArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int rows=sc.nextInt();
		System.out.println("Enter the number of colums");
		int columns=sc.nextInt();
		System.out.println("Enter the Elements in array");
		int arr[][]=new int[rows][columns];
		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=0;j<arr[i].length ;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		int arr2[][]=new int[rows][columns];
		for (int i=0;i<arr2.length ;i++ )
		{
			for (int j=0;j<arr2[i].length ;j++)
			{
				arr2[i][j]=arr[i][j]*arr[i][j];
			}
		}
		for (int i=0;i<arr2.length ;i++ )
		{
			for (int j=0;j<arr2[i].length ;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
	}
}
