package Chapter02_04;

public class student {
	
	public int studentID;
	public String studentName;
	public String address;
	
	public void showStudentInfo() {
		System.out.println(studentID + "�й��� �̸��� " + studentName + "�̰�, �ּҴ� " + address + "�Դϴ�.");
	}
	
	public String getStudentName() {
		return studentName;
	}
}
