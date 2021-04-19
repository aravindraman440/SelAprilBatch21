package week1.day2.classroom;

import java.util.Arrays;

public class SecondLargestNumber {
public static void main(String[] args) {
	int[] data = {3,2,11,4,6,7};
	Arrays.sort(data);
	int length =data.length;
	System.out.println("Second Largest Number:"+data[length-2]);
}
}
