package Chapter01;

import java.util.Scanner;

public class conditionTest {

	public static void main(String[] args) {
		
		int max;
		
		System.out.println("�� ���� ū ���� ����ϼ���");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է�1: ");
		int x = sc.nextInt();
		
		System.out.print("�Է�2: ");
		int y = sc.nextInt();
		
		max = (x > y) ? x : y;
		System.out.println(max);
	}

}
