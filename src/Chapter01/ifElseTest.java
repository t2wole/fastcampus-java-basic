package Chapter01;

public class ifElseTest {

	public static void main(String[] args) {
		
		int age = 19;
		int charge;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("아동입니다");
		}
		else if(age < 14) {
			charge = 2000;
			System.out.println("초딩입니다");
		}
		else if(age < 20) {
			charge = 2500;
			System.out.println("중, 고딩입니다");
		}
		else {
			charge = 3000;
			System.out.println("일반인입니다");
		}
		System.out.println("입장료는 " + charge + "원입니다");
		
	}

}
