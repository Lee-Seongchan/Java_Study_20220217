package a11_상속.User;

public class UserTest {

	public static void main(String[] args) {
		User user = new PersonalUser();
		user.setUsername("seongchan");
		user.setPassword("1255");

		System.out.println(user.login("seongchan", "1255"));
	}

}
