class Search 
{
	public static void main(String[] args) 
	{
		int a[]={25,15,5,12,6};
		for (int i=0;i<a.length ;i++ )
		{
			if (a[i]==5)
			{
				System.out.println(a[i]);
				break;
			}
			if(i==a.length-1)
			{
				System.out.println("-1");
				break;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
