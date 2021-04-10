package week1.day1.classroom;

public class MobileModel {
	String mobileName="SAMSUNG";
	String mobileModel="Sj17";
	int mobileWeight=2;
	boolean isfulyCharged=true;
	double mobileCost=2500.156;
public static void main(String[] args) {
	MobileModel phone =new MobileModel();
	System.out.println(phone.mobileName);
	System.out.println(phone.mobileModel);
	System.out.println(phone.mobileWeight);
	System.out.println(phone.mobileCost);
	System.out.println(phone.isfulyCharged);
}
}
