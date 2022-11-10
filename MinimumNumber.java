import java.util.Scanner;
class MinimumNumber 
{
	public static void main(String[] args) 
	{
	 {
		 Scanner scan=new Scanner(System.in);
         System.out.println("enter the the size of an array");
		 int size=scan.nextInt();
		 String a[]=new String[size];
		 System.out.println("enter the elements in an array");
		 for (int i=0;i<size ;i++ )
		 {
			 a[i]=scan.next();
		 }
		 
		 int min=a[0].length(); int index=0;
		 for (int i=0;i<size ;i++ )
		 {
			 if(min>a[i].length())
		  {
			min=a[i].length();
			index=i;
		   }

		 }
		 System.out.println("Minimum Number is " +a[index]+ " index number" +index);
	 }
	}
}
