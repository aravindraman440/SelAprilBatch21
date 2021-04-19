package week1.day2.classroom;

public class ArmStrongNumber {
public static void main(String[] args) {
	int input= 153;
	int armStrongNumber;
	int sum = 0;
	while(input>0)
	{
		int eachdigit =input%10;
		int eachdigitcube=eachdigit*eachdigit*eachdigit;
		sum=sum+eachdigitcube;
		 input=input/10;
	
	
	System.out.println(sum);
	}
}
}
