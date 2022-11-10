import java.util.Scanner;
class MergingOfTwoArrays
{
	public static void main(String[] args) 
	{
	  {
		Scanner scan=new Scanner(System.in);
		String a[]=new String[2];
		String b[]=new String[3];
		System.out.println("Enter the elements in an array");
		for (int i=0;i<2 ;i++ )
		{
			a[i]=scan.next();
		}
		for (int j=0;j<3;j++ )
		{
			b[j]=scan.next();
		}
		/*String c[]=new String[5];
		String c[0]=a[0];
		String c[1]=a[1];
		String c[2]=a[0];
		String c[3]=a[1];
		String c[4]=a[2];*/
		String c[]=new String[5];
      for (int i=0;i<2 ;i++ )
      {
		 c[i]=a[i];
      }
	  for (int j=2;j<5;j++ )
	  { 
		  c[j]=b[j-2];
	  }
	  for (int i=0;i<5 ;i++ )
	  {
		  System.out.print("[ "+c[i]+ "]");
	  }
     }
	}
}