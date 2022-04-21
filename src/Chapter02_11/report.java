package Chapter02_11;

public class report {
	
	StringBuilder sb = new StringBuilder();
	
	private String line = "===============================================\n";
	private String title = "이름\t주소\t	전화번호	\n";
	
	private void makeHeader() {
		sb.append(line);
		sb.append(title);
		sb.append(line);
	}
	
	private void generateBody() {
		sb.append("Tomas \t");
		sb.append("seoul korea \t");
		sb.append("010-1111-2222\n");
		
		sb.append("James \t");
		sb.append("newyork \t");
		sb.append("010-2222-3333\n");
	}
	
	private void makeFooter() {
		sb.append(line);
	}
	
	public String getReport() {
		makeHeader();
		generateBody();
		makeFooter();
		return sb.toString();
	}
}
