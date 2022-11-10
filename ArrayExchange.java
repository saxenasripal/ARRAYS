class ArrayExchange 
{
	public static void main(String[] args) 
	{
		int a[]={3,4,1,2,7,8,5,6,11,12,9,10};
		int x=1,temp;
		for (int i=0;i<a.length ;i+=4 )
		{
			temp=a[i];
			a[i]=a[i+2];
			a[i+2]=temp;
			if (a.length%4==0)
			{
			temp=a[x];
			a[x]=a[x+2];
			a[x+2]=temp;
			x=x+4;
			}
			else
			if (x<a.length-2)
			{
			temp=a[x];
			a[x]=a[x+2];
			a[x+2]=temp;
			x=x+4;
			}

			
		}
		for (int i=0;i<a.length ;i++ )
		{
			System.out.println(a[i]);
		}
	}
}
