package Chapter01;

public class breakTest {

	public static void main(String[] args) {
		
		int num;
		int sum = 0;
		
		for(num = 1; ; num++) {
			sum += num;
			if(num >= 100) break;
		}
		System.out.println(sum);
		System.out.println(num);
	}

}
