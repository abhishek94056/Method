package method;

public class HW3 {
	//2

	public static void main(String[] args) {
		HW4 d = new HW4();
		
		String num=d.word(1);
		System.out.println(num);
		
		String status = d.stat(67);
		System.out.println(status);
		
		System.out.println(d.avg(4, 6, 8,80, 5));
		
		System.out.println(d.ascii('%'));
		
		String check =d.number(78);
		System.out.println(check);
		
		String k=d.evodd(d.square(6));
		System.out.println(k);
		
		
	}

}
