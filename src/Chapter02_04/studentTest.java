package Chapter02_04;

public class studentTest {

	public static void main(String[] args) {
		
		student studentLee = new student();
		
		studentLee.studentID = 12345;
		studentLee.studentName = "Lee";
		studentLee.address = "����";	
		studentLee.showStudentInfo();
		
		student studentKim = new student();
		
		studentLee.studentID = 11111;
		studentLee.studentName = "Kim";
		studentLee.address = "�λ�";
		studentLee.showStudentInfo();
	}

}
