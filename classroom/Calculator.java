package week1.day2.classroom;

public class Calculator {
	public int  addition(int a, int b) {
		
		int sum = a+b;
		System.out.println("addition:"+sum);
		return sum;
	}
public int  subtraction(int a, int b) {
		
		int sum = a-b;
		System.out.println("subraction:"+sum);
		return sum;
	}
public int  multiplication(int a, int b) {
	
	int sum = a*b;
	System.out.println("multipluication:"+sum);
	return sum;
}
public int  division(int a, int b) {
	
	int sum = a/b;
	System.out.println("division:"+sum);
	return sum;
}
public double todivision(double a, double b) {
	
	double sum = a+b;
	System.out.println("double Addtion:"+sum);
	return sum;
}
public float toaddtion(float a, float b) {
	
	float sum = a/b;
	System.out.println("dfloat:"+sum);
	return sum;
}

public static void main(String[] args) {
	Calculator calc = new Calculator();
	calc.addition(10, 50);
	calc.subtraction(50, 25);
	calc.multiplication(25, 25);
	calc.division(50, 5);
	calc.toaddtion(53.234f, 10.23f);
	calc.todivision(12334.34, 2345.98765);
}
}
