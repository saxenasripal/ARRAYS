import java.util.Scanner;
class ReverseStore 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int x=sc.nextInt();
		int a=x;
		int rev=0;
		while (a!=0)
		{
			int rem=a%10;
			rev=(rev*10)+rem;
			a=a/10;
		}
		System.out.println("The reversed number is "+rev);
		System.out.println("The given Number is "+x);

		if (x==rev)
		{
			System.out.println("this is palindrom number");
		}
		else
		{
			System.out.println("this is not a palindrom number");
		}
	}
}
