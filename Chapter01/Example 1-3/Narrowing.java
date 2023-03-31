package ca.ucalgary.ensf380;
public class Narrowing {
	public static void main(String [] args) {
		double doubNum = 25.5d;
		int intNum = (int)doubNum; //explicit casting
		System.out.println("Double value: " + doubNum);
		System.out.println("Integer value: " + intNum);		
	}
}