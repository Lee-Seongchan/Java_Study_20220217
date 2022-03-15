package a17_제네릭;

import a13_인터페이스2.model.User;
import a17_제네릭.User.CompanyUser;
import a17_제네릭.User.PersonalUser;

public class ControllerTest {
	//<>가 제네릭이고 원하는 타입으로 클래스 내부를 생성할 때 바꿀 수 있다.
	
	public CMRespDto<? extends User> getProfile(String username){
		//맨 밑에 String으로 리턴하는 CMRespDto를 리턴할 수 없음 
		//User를 상속받은 객체만 제네릭으로 리턴할 수 있다.
		//상속받은 것만 와일드 카드로 리턴할 수 있다.
		PersonalUser personalUser = new PersonalUser("seongchan","1234","이성찬","a@gmail.com","a2022001");
		CompanyUser companyUser = new CompanyUser("apple","1111","애플","apple@gmail.com","220-81-47821");
		if(username.equals(personalUser.getName())) {
			return new CMRespDto<PersonalUser>(1, "개인회원프로필",personalUser);
		}else if(username.equals(companyUser.getUsername())) {
			return new CMRespDto<CompanyUser>(1,"기업회원프로필",companyUser);
		}else {
			return new CMRespDto<User>(-1, "프로필로드 실패",new User());
			//return new CMRespDto<String>(-1, "프로필로드 실패",username); 리턴 불가능
		}
	}

	public CMRespDto<?> login(String username, String password){
		//생성할 때의 제네릭 타입에 따라 와이들카드가 적용
			User userEntity = User.builder()
									.username("seongchan")
									.password("1234")
									.name("이성찬")
									.email("a@gmail.com")
									.build();

			//builder 사용방법
			//매개변수를 다 넣어줘야 하지만 bulider는 골라서 넣을 수 있다.
			//매개변수로 순서 상관 없이 넣고 싶은 것을 넣을 수 있다. 
			//그러나 아래에 위치한 것은 순서를 무조건 지켜야하고 매개변수가 비어있으면 안되기 때문에 null로 채워넣어줘야한다. 
			//User user = new User("seongchan","1234",null,null);
			
			if(userEntity.getUsername().equals(username)) {
				if(userEntity.getPassword().equals(password)) {
					//CMRespDto<?> cmRespDto = new CMRespDto<User>(1,"로그인 성공",userEntity);
					return new CMRespDto<User>(1,"로그인 성공",userEntity);
					//생성과 동시에 리턴
				}else {
					//CMRespDto<?> cmRespDto = new CMRespDto<String>(-1,"비밀번호가 틀렸습니다.",password);
					return new CMRespDto<String>(-1,"비밀번호가 틀렸습니다.",password);
				}
			}else {
				//CMRespDto<?> cmRespDto = new CMRespDto<String>(-1, "아이디가 틀렸습니다", username);
				return new CMRespDto<String>(-1, "아이디가 틀렸습니다", username);
			}
			
	}
	public static void main(String[] args) {
		ControllerTest test = new ControllerTest();
		System.out.println(test.login("seongchan", "1234"));
		System.out.println(test.getProfile("seongchan"));
	}

}
