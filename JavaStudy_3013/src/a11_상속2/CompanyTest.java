package a11_상속2;

public class CompanyTest {

	public static void main(String[] args) {
		ElectronicsCompany samsumg = new ElectronicsCompany("삼성");
		ElectronicsCompany lg = new ElectronicsCompany("LG");
		DeliveryCompany baemin = new DeliveryCompany("배달의 민족");
		DeliveryCompany yogiyo = new DeliveryCompany("요기요");
		
		Company samsung_company = samsumg; //업캐스팅
		Company lg_company = lg;
		Company baemin_company = baemin;
		Company yogiyo_company = yogiyo;
		
		samsumg.setCompanyName("삼송");
		
		samsumg.setCompanyName("삼성전자");
		lg.setCompanyName("lg");
		baemin.setCompanyName("배달의 민족");
		yogiyo.setCompanyName("요기요");
		
		samsung_company.setCompanyName("삼성");
		
		samsumg.showCompanyInfo();
		lg.showCompanyInfo();
		baemin.showCompanyInfo();
		yogiyo.showCompanyInfo();
		
		samsumg.addFactory();
		lg.addFactory();
		baemin.addMotocycle();
		yogiyo.addMotocycle();
		
		samsung_company.showCompanyInfo();
		ElectronicsCompany down_samsung_Comany = (ElectronicsCompany)samsung_company; //다운캐스팅
		down_samsung_Comany.addFactory();
	}

}
