package Chapter02_03;

public class functionTest {
	
	public static int addNum(int num1, int num2) {
		 int result;
		 result = num1 + num2;
		 return result;
	}
	
	// 반환값이 없다면 void를 사용한다.
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		
		int total = addNum(n1, n2);
		System.out.println(total);
		
		sayHello("안녕하세요");

	}
}
