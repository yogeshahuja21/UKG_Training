package Lab1;

public class ques1 {
	public static void main(String[] args) {
		int a=1;
		int b=1;
		int c;
		Double avg=0.0;
		System.out.println("First 20 Fibonacci numbers are : ");
		for(int i=0;i<20;i++)
		{
			System.out.print(a+" ");
			avg+=a;
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println("\nThe average is : "+avg/20);

	}
}
