package method;

public class HW1 {

	//WAM to check if number is prime or not.
		public void prime(int num)
		{
			if(num<=0)
			{
				System.out.println("not prime");
			}
			else
			{
				boolean b = true;
				for(int i =2;i<=Math.sqrt(num);i++)
				{
					if(num%i==0)
						b=false;
					    break;
				}
				if(b)
				{
					System.out.println("prime");
				}
				else
				{
					System.out.println("not prime");
				}
				
			}
		}
		
		//WAM to check if number is Armstrong or not.
		public void Armstrong(int n)
		{
			int rem;
			int arm =0;
			int c = n;
			while(n>0)
			{
				rem = n%10;
				arm+=rem*rem*rem;
				n = n/10;	
			}
			if(arm==c)
			{
				System.out.println("Armstrong");
			}
			else
			{
				System.out.println("not Armstrong");
			}
		}
		
		// WAM to check if number is palindrome or not.
		public void pal(int p)
		{
			int c,r,k=0;
			c=p;
			while(p>0)
			{
				r=p%10;
				k=(k*10)+r;
				p=p/10;
			}
			if(c==k)
			{
				System.out.println("palindrom");
			}
			else
			{
				System.out.println("not palindrom");
			}
		}	
	
	
//WAM to print table of a number.
	public void table(int num)
	{
		for(int i =1;i<=10;i++)
		{
			System.out.println(num*i);
		}
	}
	
	//WAM to print reverse of a number.
		public void rev(int n)
		{
			int r;
			while(n>0)
			{
				r=n%10;
				System.out.print(r);
				n=n/10;
			}
			System.out.println();
		}
		
		//WAM to find factorial of a number.
		
		public void fact(int num)
		{
			int fact =1;
			for(int i = 1;i<=num;i++)
			{
				fact=fact*i;
			}
			System.out.println(fact);
		}
	
	//WAM to print ASCII value of a symbol.
	public void ascii(char sym)
	{
		System.out.println((int)sym);
	}
	
	//WAM to perform all mathematical operations on given 2 numbers.
	
	public void add(int a,int b)
	{
		System.out.println("addition of a and b is: "+(a+b));//addition
	}
	
	public void sub(int a,int b)
	{
		System.out.println("addition of a and b is: "+(a-b));//subtraction
	}
	
	public void mul(int a,int b)
	{
		System.out.println("addition of a and b is: "+(a*b));//multiplication
	}
	
	public void div(int a,int b)
	{
		System.out.println("addition of a and b is: "+(a/b));//division
	}
	
	public void rem(int a,int b)
	{
		System.out.println("addition of a and b is: "+(a%b));//reminder
	}
	
	//WAM to find average of 5 numbers.
	
	public void avg(int num1,int num2, int num3, int num4, int num5)
	{
		float average=(num1+num2+num3+num4+num5/5);
		System.out.println("average of "+num1+num2+num3+num4+num5+" is: "+average);
	}
	
	//WAM to convert dollar into INR.
	
	public void doller(int num)
	{
		float inr=num*83;
		System.out.println("value of "+num+" Doller in INR is "+inr);
	}
	
}
