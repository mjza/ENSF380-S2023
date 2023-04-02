public class Border1 {
	public static void main(String[] args){
		System.out.print("-1: ");
		border(-1);
		System.out.print("0: ");
		border(0);
		System.out.print("5: ");
		border(5);
		System.out.print("10: ");
		border(10);
		System.out.print("11: ");
		border(11);
	}
	public static void border(int num) {
		if (num < 0) 
			System.out.println("num is < 0");
		else if ( num >= 0 ) {// Outer if
			if ( num < 10 )// Inner if
				System.out.println("num is in [0,10)");
		} 
	}
}