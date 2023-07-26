import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the range to print prime numbers");
		int n= scan.nextInt();
		for(int i=3; i<=10;i++)
		{
			int res = checkPrime(i);
			if(res!=0) {
			System.out.println(res);
			}
			
		}
		
public static int checkPrime(int n)
{
	for(int i=3;i<=10;i++)
	{
		if(n%i==0)
		{
			return 0;
		} 
	}
		return n;
		

	}
}
