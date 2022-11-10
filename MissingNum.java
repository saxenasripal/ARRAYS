class MissingNum 
{
	public static void main(String[] args) 
	{
		int n=5;
		int x;
		int arr[]=new int[n];
		int arr2[]={1,2,3,4,5};
		boolean flag=false;
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=5;
		for (int i=0;i<n ;i++ )
		{
			for (int j=1;j<=n ;j++ )
			{
				if(arr[i]==j)
				{
					for (int k=0;k<arr2.length;k++ )
					{
						if(arr[i]==arr2[k])
						{
							arr2[k]=0;
						}
					}
				}
			}
		}
		for (int i=0;i<arr2.length;i++ )
		{
			if(arr2[i]!=0)
			{
				System.out.println(arr2[i]);
			}
		}
	}
}
