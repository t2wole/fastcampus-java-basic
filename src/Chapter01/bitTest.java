package Chapter01;

public class bitTest {

	public static void main(String[] args) {
		
		int num1 = 5;	// 00000101
		int num2 = 10;	// 00001010
		
		System.out.println(num1 | num2);	// or -> 00001111
		System.out.println(num1 & num2);	// and -> 00000000
		System.out.println(num1 ^ num2);	// xor -> 00001111(�� �ڸ����� �ٸ��� 1)
		System.out.println(~num1);			// not -> 0�� 1, 1�� 0����(�տ� -�� ����)
		
		System.out.println(num1 << 2);
		System.out.println(num1);
		System.out.println(num1 <<= 2);
		System.out.println(num1);
	}

}
