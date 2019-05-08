package calculator;

public class CAlculatorJava {
	
	public int sum(int a, int b) {
		
		return a+b;
	}
	
	public int mul(int a, int b) {
		
		return a*b;
	}

	public static void main(String[] args) {
		CAlculatorJava cal=new CAlculatorJava();
		System.out.println(cal.sum(10,10));
		System.out.println(cal.mul(10,10));

	}

}
