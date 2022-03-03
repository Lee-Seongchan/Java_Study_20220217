package a10_배열;

public class UserArrayTest {

	public static void main(String[] args) {
		User[] users = new User[5];
		
		users[0] = new User("seongchan","1234");
		users[1] = new User("seongchan1","1234");
		users[2] = new User("seongchan2","1234");
		users[3] = new User("seongchan3","1234");
		users[4] = new User("seongchan4","1234");
		
		
		for(int  i = 0; i < users.length; i++) {
			/*
			if(users[i]! = null) {
				users[i].showInfo();
			}
			 */
			
			if(users[i] == null) {
				continue;
			}
			users[i].showInfo();
		}
		
		System.out.println("=================================");
		
		int[] numbers = new int[5];
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		//null은 주소값이 0 -> 비어있다
	}

}
