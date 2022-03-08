package a11_상속2;

public class ElectronicsCompany extends Company{
	public ElectronicsCompany() {
		
	}
	
	public ElectronicsCompany(String companyName) {
		super(companyName + "전자");
		//super.setCompanyName(companyName); //부모가 가지고 있는 setCompanyName
	}
	
	
	
	@Override
	public void setCompanyName(String companyName) {
		// TODO Auto-generated method stub
		super.setCompanyName(companyName + "전자");
	}

	public void addFactory() {
		System.out.println(super.getCompanyName() + " 공장을 추가합니다.");
	}
}
