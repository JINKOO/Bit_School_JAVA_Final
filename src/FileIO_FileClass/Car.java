package FileIO_FileClass;

public class Car {

	private String CarNum;
	private String Company;
	private int price;
	
	//상속 관계에서의 직렬화 , 역직렬화 시 자식class가 직렬화 가능 class이면
	//가장 가까운 슈퍼 class에는 기본 생성자가 있어야 한다.
	
	public Car() {
		
	}
	
	public Car(String CarNum, String Company, int price) {
		this.CarNum = CarNum;
		this.Company = Company;
		this.price = price;
	}

	public String getCarNum() {
		return CarNum;
	}

	public void setCarNum(String carNum) {
		CarNum = carNum;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
