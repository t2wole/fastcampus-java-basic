package Chapter02_06;

public class Student {
	
	public String studentName;
	public int studentNumber;
	public int grade;
	
	public Student(String studentName, int studentNumber, int grade) {
		this.studentName = studentName;
		this.studentNumber = studentNumber;
		this.grade = grade;
	}
	
	public String showStudentInfo() {
		return studentName + "�л��� �й��� " + studentNumber + "�̰�, " + grade + "�г� �Դϴ�.";
	}
}
