package Chapter02_07;

public class UserInfoTest {

	public static void main(String[] args) {
		
		UserInfo userLee = new UserInfo();
		userLee.userId = "a12345";
		userLee.userPassword = "zsc21345";
		userLee.userName = "Lee";
		userLee.phoneNumber = "0101111111";
		userLee.userAddress = "¼­¿ï";
		
		System.out.println(userLee.showUserInfo());

		UserInfo userKim = new UserInfo("b1234", "zxcc1234", "kim");
		
		System.out.println(userKim.showUserInfo());
	}

}
