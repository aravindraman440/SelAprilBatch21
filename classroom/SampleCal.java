package week1.day2.classroom;

public class SampleCal {

	public int add(int a , int b) {
		int sum =0;
		sum = a+b;
		return sum;

	}
	public void sub(double a1 , double b1) {
		double subt =0;
		subt = a1 - b1;
		System.out.println(subt);


	}
	public void multiply(double a2, double b2) {
		double mult =0;
		mult = a2*b2;
		System.out.println(mult);


	}
	public int divide(int a3, int b3) {

		int div =0;
		div = a3/b3;
		return div;

	}
	public static void main(String[] args) {
		 SampleCal C = new  SampleCal();
		System.out.println(C.add(1, 2));
		C.sub(11.5, 2.5);
		C.multiply(11.5, 2.5);
		System.out.println(C.divide(10, 20));
	}
}
