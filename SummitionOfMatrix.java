import java.util.Scanner;
class SummitionOfMatrix 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows");
		int rows=sc.nextInt();
		System.out.println("enter the colums");
		int colums=sc.nextInt();
		int arr1[][]=new int[rows][colums];
		System.out.println("enter the elements in first array");
		for (int i=0;i<arr1.length;i++ )
		{
			for (int j=0;j<arr1[i].length ;j++ )
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		int arr2[][]=new int[rows][colums];
		System.out.println("enter the elements in Second array");
		for (int i=0;i<arr2.length;i++ )
		{
			for (int j=0;j<arr2[i].length ;j++ )
			{
				arr2[i][j]=sc.nextInt();
			}
		}
		int arr3[][]=new int[rows][colums];
		System.out.println("enter the elements in first array");
		for (int i=0;i<arr3.length;i++ )
		{
			for (int j=0;j<arr3[i].length ;j++ )
			{
				arr3[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		for (int i=0;i<arr3.length;i++ )
		{
			for (int j=0;j<arr3[i].length ;j++ )
			{
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
