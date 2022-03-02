package a09_클래스_정보은닉;

/**
 * 접근지정자(AceessModifier)
 * 
 * default 
 * protected
 * public 
 * private
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
