class InsertingElement 
{
	public static void main(String[] args) 
	{
		 int a[]={5,4,3,2,1};
		//int a[]=new Int[5];
		if (a[a.length-1]==0)
		{
			System.out.println("No Space");
		
			for (int i=4;i>=1 ;i--)
			{
				a[i]=a[i-1];
			
			if (a[i]==a[1])
			{
				a[1]=2;
			}
			}
			for (int i=0;i<=4;i++ )
			{
				System.out.println(a[i]);
			}
			}

		
	}
}
