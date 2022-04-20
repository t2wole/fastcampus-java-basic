package Chapter01;

public class forTest {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		for(int i = 0; i < 10; i++) {
			sum += num;
			num++;
		}
		System.out.println(sum);
		
		int n = 1;
		int total = 0;
		
		while(n <= 10) {
			total += n;
			n++;
		}
		System.out.println(total);
	}

}
