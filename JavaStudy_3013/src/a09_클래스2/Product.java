package a09_클래스2;

/**
 * 
 * 클래스(틀)
 * 1. 속성(변수)
 * 2. 기능(메서드)
 *
 * 자동차(틀) 객체 
 * 속성(변수)
 * 차종
 * 차량색상
 * 
 * 기능(메서드)
 * 앞으로 간다
 * 뒤로 간다
 * 기름을 넣는다
 * 창문을 연다
 * 미디어(소리)를 켠다, 끈다.
 * 
 * 프로그래밍 적인 사고 
 * 클래스를 정의(참조 자료형을 정의하는 것)
 * 정의된 클래스를 생성
 * 생성시에 heap 메모리 영역에 주소를 할당.
 * 
 */
public class Product {
	private int productCode;
	private String productName;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Product(int productCode, String productName) {
		super();
		this.productCode = productCode;
		this.productName = productName;
	}



	//private를 사용하면 외부에서 입력과 출력을 할 수 없다. 그렇기 때문에 게터와 세터를 사용
	public int getProductCode() {
		return productCode;
	}

	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void showProduct() {
		System.out.println("상품코드 : " + productCode);
		System.out.println("상품명 : " + productName);
	}
}
