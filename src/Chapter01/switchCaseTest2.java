package Chapter01;

public class switchCaseTest2 {

	public static void main(String[] args) {
		
		String medal = "gold";
		
		switch(medal) {
		case "gold":
			System.out.println("�ݸ޴��Դϴ�");
			break;
		case "silver":
			System.out.println("���޴��Դϴ�");
			break;
		case "bronze":
			System.out.println("���޴��Դϴ�");
			break;
		default:
			System.out.println("�޴��� �����ϴ�");
			break;
		}
	}

}
