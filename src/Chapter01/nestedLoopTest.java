package Chapter01;

public class nestedLoopTest {

	public static void main(String[] args) {
		
		int dan = 2;
		int count = 1;
		
		for(dan = 2; dan <= 9; dan++) {
			for(count = 1; count <= 9; count++) {
				System.out.println(dan + " x " + count + " = " + dan * count);
			}
			System.out.println();
		}	
	}
}
