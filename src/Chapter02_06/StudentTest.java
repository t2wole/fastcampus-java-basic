package Chapter02_06;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student("Lee", 12345, 3);
		
		String result = studentLee.showStudentInfo();
		System.out.println(result);
		
	}

}
