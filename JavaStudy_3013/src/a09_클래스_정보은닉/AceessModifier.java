package a09_클래스_정보은닉;

/**
 * 접근지정자(AceessModifier)
 * 
 * default 		클래스가 위치하고 있는 패키지 내부 (같은 패키지)
 * protected 	기본 접근 권한은 default와 같다, 하지만 상속 관계를 가지면 다른 패키지에 있어도 접근을 허용한다
 * public  		모든 위치에서 접근이 가능하다.
 * private 		본인 클래스 내부에서만 접근이 가능하다.
 * 
 * 외부로 부터 표출되어 지지 않아야 하는 것을 private를 통해 정보 은닉
 */
public class AceessModifier {

		String name;
		protected int age; 
		public String phone;
		private String addpress;
		
		public AceessModifier() {
			this.addpress = "부산";
		}
}
