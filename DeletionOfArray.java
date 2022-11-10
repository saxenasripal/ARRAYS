class DeletionOfArray 
{
	public static void main(String[] args) 
	{ 
		
		int a[]={5,6,4,7,9};
		int n=a.length-1;
		int x=4;
		for (int i=0;i<=4 ;i++ )
		{ 
			if (a[i]==x)
			{			
			for (int j=i;j<n ;j++ )
			{
				a[j]=a[j+1];								
            }
			
   		}
		for (int j=0;j<=4 ;j++ )
		{
			System.out.println(a[j]);
		}

		}
	}
}
