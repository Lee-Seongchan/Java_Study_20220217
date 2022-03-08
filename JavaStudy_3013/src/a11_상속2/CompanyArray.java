package a11_상속2;

public class CompanyArray {

	public static void main(String[] args) {
/*	
 *	정수 배열 
 * 
 * 	int[] numArray = new int[5];
	
		for(int i = 0; i < numArray.length; i++) {
			numArray[i] = i + 1;
		}
		
		for(int i = 0; i < numArray.length; i++) {
			System.out.println(numArray[i]);
		}
*/	

		
/* 문자열 배열
* 	
		String[] strArray = new String[5];
		
		for(int i = 0; i < strArray.length; i++) {
			strArray[i] = "성찬" + (i + 1);
		}
		
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
*/
	
		
		Company[] companies = new Company[5];
		
		companies[0] = new ElectronicsCompany("삼성");
		companies[1] = new DeliveryCompany("배달의 민족");
		companies[2] = new ElectronicsCompany("삼성");
		companies[3] = new DeliveryCompany("요기요");
		companies[4] = new Company("일반 회사");
		
		for(int i =0; i < companies.length; i++) {
			System.out.println(companies[i]);
			companies[i].showCompanyInfo();
			if(companies[i] instanceof ElectronicsCompany) {
				ElectronicsCompany ec = (ElectronicsCompany)companies[i];
				ec.addFactory();
			}else if(companies[i] instanceof DeliveryCompany) {
				DeliveryCompany dc = (DeliveryCompany)companies[i];
				dc.addMotocycle();
			}else {
				System.out.println("다운캐스팅을 할 수 없는 객체입니다.");
			}
			
			System.out.println();
		}
		

		
		
	}

}
