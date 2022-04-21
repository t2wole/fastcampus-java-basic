package Chapter02_10;

public class birthday {
	
	private int day;
	private int month;
	private int year;
	
	private boolean isValid; // boolean �� �ʱⰪ�� false

	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		
		if(day < 1 || day > 31) {
			isValid = false;
		}
		else {
			this.day = day;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		
		if(month < 1 || month > 12) {
			isValid = false;
		}
		else {
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
			this.year = year;
	}
	
	public void showDate() {
		if(isValid) {
			System.out.println(year + "�� " + month + "�� " + day + "�� �Դϴ�.");
		}
		else {
			System.out.println("��ȿ���� �ʴ� ��¥�Դϴ�.");
		}
	}

}