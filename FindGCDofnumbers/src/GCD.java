import java.util.Scanner;
public class GCD {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two numbers");
		int m =scan.nextInt();
		int  n =scan.nextInt();
		int res = findGcd(m,n);
		System.out.println("GCD of"+ m + "and"+ n+ "is"+ res);
		
	}



static int FindGCD(int m,int n)
{
	while(n!=0)
	{
		int rem =m%n;
		m=n;
				n=rem;
	}
	int gcd =m;
	return gcd;
	}
}


