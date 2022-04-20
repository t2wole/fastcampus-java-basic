package Chapter02_04;

public class student {
	
	public int studentID;
	public String studentName;
	public String address;
	
	public void showStudentInfo() {
		System.out.println(studentID + "학번의 이름은 " + studentName + "이고, 주소는 " + address + "입니다.");
	}
	
	public String getStudentName() {
		return studentName;
	}
}
