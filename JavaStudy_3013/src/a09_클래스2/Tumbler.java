package a09_클래스2;

public class Tumbler extends Product{
	private String cap; // 버튼식, 오픈식

	public Tumbler(int productCode, String productName, String cap) {
		super(productCode, productName); // 부모 생성자
		this.cap = cap;
	}
	
	public void tumblerTest() {
		System.out.println("텀블러만 가지고 있는 메소드");
	}
	
	@Override
	public void showProduct() {
		// TODO Auto-generated method stub
		super.showProduct();
		System.out.println("뚜껑타입 : " + cap);
	}
	
		// public void showTumblerInfo() {
		// super.showProduct();
	
		
		// 부모의 것을 그대로 오버라이딩 하는 것이 더 좋음.
		// 머그컵에게는 상품의 정보를 보기 위한 showTumblerInfo 기능이 없다.
	}


