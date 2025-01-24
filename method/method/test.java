package method;

public class test {

	public static void main(String[] args) {
		int num =5;
		if(num>=2)
		{
			for(int i =2;i<num;i++)
			{
				if(i%1==0)
				{
					System.out.println("the number is not prime");
				}
				else
				{
					System.out.println("The number is prime");
				}
			}
		}
		else
		{
			System.out.println("the number is not prime");
		}
	}

}
