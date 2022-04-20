package Chapter01;

import java.util.Scanner;

public class conditionTest {

	public static void main(String[] args) {
		
		int max;
		
		System.out.println("두 수중 큰 수를 출력하세요");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1: ");
		int x = sc.nextInt();
		
		System.out.print("입력2: ");
		int y = sc.nextInt();
		
		max = (x > y) ? x : y;
		System.out.println(max);
	}

}
