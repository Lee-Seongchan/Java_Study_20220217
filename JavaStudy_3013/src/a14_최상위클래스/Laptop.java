package a14_최상위클래스;

public class Laptop extends Computer{
	private String company;
	private String model;
	
	public Laptop(String company, String model) {
		super();
		this.company = company;
		this.model = model;
	}
	
	//toString 해당 객체가 가지고 있는 속성들을 바로 코딩하기 위해서 사용
	@Override
	public String toString() {
		return "Laptop [company=" + company + ", model=" + model + "]";
	}

	
	
}
