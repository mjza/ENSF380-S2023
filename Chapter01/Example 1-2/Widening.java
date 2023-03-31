package ca.ucalgary.ensf380;

public class Widening {
	public static void main(String [] args) {
		int intNum = 25;
		double doubNum = intNum; //automatic cast
		System.out.println("Integer value: " + intNum);
		System.out.println("Double value: " + doubNum);
	}
}