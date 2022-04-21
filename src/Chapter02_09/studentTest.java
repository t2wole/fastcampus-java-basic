package Chapter02_09;

public class studentTest {

	public static void main(String[] args) {
		
		student studentLee = new student(100, "Lee");
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setMathSubject("수학", 90);
		
		student studentKim = new student(109, "Kim");
		studentKim.setKoreaSubject("국어", 80);
		studentKim.setMathSubject("수학", 70);
		
		studentLee.showStudentScore();
		studentKim.showStudentScore();
	}

}
