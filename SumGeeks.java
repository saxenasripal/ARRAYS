class  SumGeeks
{
	public static void main(String[] args) 
	{
		int arr[]={1,2,3,7,5};
		int x=10;
		int sum=0;
		int j=0;
		for (int i=0;i<arr.length ;i++ )
		{
			sum=sum+arr[i];
			if (sum>x)
			{
				j++;
				i=j-1;
				sum=0;
			}
			else if(sum==x)
			{
				System.out.println((j+1)+" "+(i+1));
				break;
			}
		}
		
	}
}
