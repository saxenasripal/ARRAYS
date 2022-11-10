class NotReapet 
{
	public static void main(String[] args) 
	{
		int a[]={2,4,2,4,5,6,7,8,6,7,8,5,10};
		boolean flag=false;
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a.length;j++)
			{
				if (j!=i)				
				{
					if(a[i]!=a[j])
					{
						if (j==a.length-1)
						{
							System.out.println(a[i]);
							flag=true;
						}

					}
					else
					{
						break;
					}
				}
			}
			if(flag)
			{
				break;
			}
			else if(i==a.length-1)
			{
				System.out.println(a[a.length-1]);
			}
		}
	}
}
