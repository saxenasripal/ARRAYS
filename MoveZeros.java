import java.util.Scanner;
class MoveZeros
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int arr[]={2,0,4,7,0,6,0,3,0};
		int len=arr.length;
		for (int i=0;i<len ;i++ )
		{
			if (arr[i]==0)
			{
				for (int j=i+1;j<len ;j++ )
				{
					if (arr[j]!=0)
					{
						int temp=arr[j];
						arr[j]=arr[i];
						arr[i]=temp;
						break;
					}
				}
			}
		}
		for (int i=0;i<len ;i++ )
		{
			System.out.println(arr[i]);
		}
	}
}
