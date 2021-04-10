package week1.day1.classroom;

public class Mobile {
public void makeCall() {
	System.out.println("MAKE  CALL");
}
public void sendMsg() {
	System.out.println("SNDING MSG");
}
public static void main(String[] args) {
Mobile obj = new Mobile();
obj.makeCall();
obj.sendMsg();
}
}