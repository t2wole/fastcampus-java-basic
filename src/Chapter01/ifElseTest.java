package Chapter01;

public class ifElseTest {

	public static void main(String[] args) {
		
		int age = 19;
		int charge;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("�Ƶ��Դϴ�");
		}
		else if(age < 14) {
			charge = 2000;
			System.out.println("�ʵ��Դϴ�");
		}
		else if(age < 20) {
			charge = 2500;
			System.out.println("��, ����Դϴ�");
		}
		else {
			charge = 3000;
			System.out.println("�Ϲ����Դϴ�");
		}
		System.out.println("������ " + charge + "���Դϴ�");
		
	}

}
