package method;

public class HW {

	public static void main(String[] args) {
		HW1 d1 = new HW1();
		
		//WAM to check if number is prime or not.
		d1.prime(8);
		
		//WAM to check if number is Armstrong or not.
		d1.Armstrong(686);
		
		//WAM to check if number is palindrome or not.
		d1.pal(7287);
		
		//WAM to print reverse of a number.
		d1.rev(679);
		
		//WAM to find factorial of a number.
		d1.fact(4);
		
		//WAM to print table of a number.
		d1.table(6);
		
		//WAM to print ASCII value of a symbol.
		d1.ascii('a');
		
		//WAM to perform all mathematical operations on given 2 numbers.
		d1.add(5, 9);
		d1.sub(8, 5);
		d1.mul(3, 9);
		d1.div(6, 2);
		d1.rem(9, 2);
		
		//WAM to find average of 5 numbers.
		d1.avg(4, 5, 4, 9, 2);
		
		//WAM to convert dollar into INR.
		d1.doller(8);
	}

}
