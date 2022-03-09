package a13_인터페이스2.service;

import a13_인터페이스2.data.UserData;
import a13_인터페이스2.model.User;

public class UserServiceImpl implements UserService{
	private final UserData userData;
	
	public UserServiceImpl(UserData userData) {
		this.userData = userData;
	}
	//유저 데이터를 추가, 유저 데이터 가지고 오는 것
	@Override
	public void addUser(User user) {
		User[] users = userData.getUsers(); //user배열 주소 가져옴.
		for(int i = 0; i < users.length; i++) { //user배열에서 빈공간이 있으면 입력한 user 객체를 배열에 저장하겠다.
			if(users[i] == null) {
				users[i] = user;
				break;
			}
		}
	}

	@Override
	public User[] getUsers() {
		
		return userData.getUsers();
	}

	@Override
	public User getUser(String username) {
		//반복문을 사용해서 배열에 들어있는 user 객체들 중에 
		//매겨변수(우리가 찾고자 하는 username)를 가진 user객체를 return
		return null;
	}

}
