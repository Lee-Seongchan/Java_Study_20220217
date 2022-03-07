package a11_상속;

public class TestMain {

	public static void main(String[] args) {
		Test test = new Test();
		Test1 test1 = new Test1();
		Test2 test2 = new Test2();
		
		
//		Test1[] t1Array = new Test1[10];
//		t1Array[0] = test1;
//		t1Array[1] = test2; 1번은 가능하지만 2번은 자료형이 다르기 때문에 들어갈 수 없다.
		
		// 자식 -> 부모 : 업캐스팅
		Test t1 = test1;
		Test t2 = test2;
		Test[] tArray = new Test[2];
		tArray[0]= test1;
		tArray[1]= test2; //원래 라면 1번은 가능하지만 2번은 자료형이 다르기 때문에 들어갈 수 없다.
						  //그러나 부모의 배열로 만들었을 경우에는 상속 받고 있기 때문에 수용가능하다.
		
		// 부모 -> 자식 : 다운캐스팅 (어떤 자료형으로 바꿀 것인지 명시를 해줘야함)
		Test tt1 = (Test1)t1;
		Test tt2 = (Test2)t2;
		
		//잘못된 다운캐스팅1
		Test ttt = new Test(); //부모 혼자 존재
		Test1 ttt1 = (Test1)ttt; 
		
		//잘못된 다운캐스팅2
		Test tttt1 = new Test1();
		Test tttt = tttt1; //업캐스팅
		Test2 tttt2 = (Test2)tttt; // 즉 다운캐스팅이라는 것은 업캐스팅이라는 것이 이루어진 후에만 가능하다 
								   // 업캐스팅이 이루어진 후에도 본인의 자식 클래스로만 다운 캐스팅이 가능하다.
	}

}

