package method;

public class HW4 {
	
	
	//WAM to return number in word.
		public String word(int num)
		{
			switch(num)
			{
			case 1:return ("one");
			case 2:return ("two");
			case 3:return ("three");
			default:return("enter valid number");
			
			}
		}
		
		//WAM to return status of a number i.e. positive negative or zero.
		public String stat(int num)
		{	
			if(num>0)
			{
				return "positive";
			}
			else if(num<0)
			{
				return "negative";
			}
				
			else
			{
				return"zero";
			}
			
		}
		
		// WAM to return average of 5 numbers.
		public float avg(int num1, int num2, int num3, int num4, int num5)
		{
			return (num1+num2+num3+num4+num5/5);
			
		}
		
		//WAM to return ASCII value of a symbol.
		public int ascii(char ch)
		{
			return ((int)ch);
		}
		
		//WAM to return 1 if number is prime, 0 otherwise.
		public String number(int num)
		{
			if(num>0)
			{
				return("not prime");
			}
			else
			{
				boolean b = true;
				for(int i = 2;i<=Math.sqrt(num);i++)
				if(num%i==0)
				{
					b=false;
					break;
				}
				if(b)
				{
					return("prime");
				}
				else
				{
					return("not prime");
				}
			}
		}
		
		public int square(int s)
		{
			return s*s;
		}
		
		public String evodd(int t)
		{
			if(t%2==0)
			{
				return("even");
			}
			else
			{
				return("odd");
			}
		}

}
