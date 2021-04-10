package week1.day1.assignment;

public class FibbanocciSeries {
public static void main(String[] args) {
	int range= 8;
	int firstnum=0;
	int secondnum=1;
	int sum;
	for (int i = 0; i < range; i++) {
	sum=firstnum+secondnum;
	secondnum=firstnum;
	firstnum=sum;
	System.out.print(firstnum+" ");
	}
	
}
}/*
	 * int num1=0; int num2=1; int nextnum; for (int i = 0; i < 7; i++) {
	 * nextnum=num1+num2; num1=num2; num2=nextnum; System.out.print(nextnum+ " "); }
	 * }
	 */