package a11_상속;

public class AnimalTest {

	public static void main(String[] args) {
		Human human = new Human();
		Eagle eagle = new Eagle();
		Tiger tiger = new Tiger();
		
		human.move();
		eagle.move(); //상속을 받았기 때문에 주석 처리를 하더라도 호출가능
		tiger.move(); //자식과 부모 전부 move라는 메서드를 가지고 있다. 둘다 있다면 자식이 우선
		
		// 업캐스팅 전
		human.readBooks();
		eagle.flying();
		tiger.hunting();
		
		///////////////
		// 업캐스팅 후 
		Animal ah = human;
		Animal ae = eagle;
		Animal at = tiger;
		
		ah.move();
		ae.move();
		at.move();
		
								//업캐스팅 한 후 후엔 readBook를 할 수 없음 -> 부모의 메소드만 사용 가능함
								//(사람이 가지고 있는 메소드를 사용 불가)
		Human hh = (Human)ah;   // 다운 캐스팅
		hh.readBooks(); 		//다운 캐스팅 되고 나서는 다시 사용 가능함.
		Eagle ee = (Eagle)ae;
		ee.flying();
		Tiger tt = (Tiger)at;
		tt.hunting();
		
		Animal[] animals = new Animal[3];
		animals[0] = human;
		animals[1] = eagle;
		animals[2] = tiger;
		
		
		for(int i =0; i < animals.length; i++) {
			animals[i].move();
		}for(int i = 0; i < animals.length; i++) {
			//instanceof(업캐스팅 되기 전의 자료형을 비교)
			if(animals[i] instanceof Human) {
			Human h = (Human)animals[i];
			h.readBooks();
			}else if(animals[i] instanceof Eagle) {
				Eagle e = (Eagle)animals[i];
				e.flying();
			}else if(animals[i] instanceof Tiger) {
				Tiger t = (Tiger)animals[i];
				t.hunting();
			}
		}
	}

}
