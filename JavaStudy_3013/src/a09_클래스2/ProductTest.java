package a09_클래스2;

public class ProductTest {
	
	public static void test2(Product pp) {
		pp.showProduct();
	} 
	
	
	public static Product test() {
		Product product = new Product(); // 힙 메모리에 주소를 생성하고 그 주소를 product에 담음
			//heap 메모리에 할당된 주소
		product.showProduct();
		product.setProductCode(20220307); 	//set은 해당 변수에 대입
		product.setProductName("모니터1");
		return product;   
	}		//heap 메모리에 할당된 주소를 리턴
	
	
	public static void main(String[] args) {
		Product p = test();  //test 메소드를 호출하여 product를 리턴하여 p에 담음
		//p.showProduct();
		test2(p); // p를 pp에 보냄. -> 매개변수로도 주소를 전달할 수 있다. 
		
		Product tumbler = new Tumbler(2000, "스타벅스 텀블러", "오픈식");
		Product cup = new MugCup(3000, "스타벅스 머그컵", true);
		//Tumbler 대신 Product
		//MugCup 대신 Product를 사용 가능 (업 캐스팅)
		
		tumbler.showProduct();
		cup.showProduct();
		//부모가 showProduct를 가지고 있기 때문에 사용 가능함.
		//자식이 오버라이딩 한 것을 출력.
		
		Product[] products = new Product[2];
		products[0] = tumbler; //0번째 공간에 tumbler 변수(자식 객체의 업캐스팅된 주소를 가지고 있음)를 담음
		products[1] = cup;
		
		for(int i = 0; i < products.length; i++) {
			products[i].showProduct();
			if(products[i] instanceof Tumbler) {
				Tumbler tumbler2 = (Tumbler)products[i];
			}else {
				MugCup cup2 = (MugCup)products[i];
				cup2.mugcupTest();
				//업캐스팅 된 것만 다운캐스팅 가능.
				//업캐스팅 후엔 부모 메소드만 사용 가능 -> 다운 캐스팅을 하여 자식 메소드를 사용하기 위해서는 instanceof를 사용
				
			}
		}
		
	}

}
