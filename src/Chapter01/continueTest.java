package Chapter01;

public class continueTest {

	public static void main(String[] args) {

		int n;
		
		for(n = 1; n <= 100; n++) {
			
			if((n % 3) != 0) continue;
			
			System.out.println(n);
		}
	}

}
