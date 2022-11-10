class ExchangeRowsColums 
{
	public static void main(String[] args) 
	{
		int arr1[][]={{1,8,4,5},{9,7,2,3},{7,6,4,6},{3,6,2,4}};
		//int arr2[][]=new int[3][3];
		int temp;
		for (int i=0;i<arr1.length;i++ )
		{
			
			for (int j=0;j<=i;j++ )
			{
				temp=arr1[i][j];
				arr1[j][i]=arr1[i][j];
				arr1[i][j]=temp;
			}
		}
		for (int i=0;i<arr1.length ;i++ )
		{
			for (int j=0;j<arr1[i].length ;j++ )
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
	}
}
