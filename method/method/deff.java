package method;

public class deff {
//WAM to print table of a number.
	public void table(int num)
	{
		for(int i =1;i<=10;i++)
		{
			System.out.println(num*i);
		}
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
