package FileIO_FileClass;

public class Car {

	private String CarNum;
	private String Company;
	private int price;
	
	//��� ���迡���� ����ȭ , ������ȭ �� �ڽ�class�� ����ȭ ���� class�̸�
	//���� ����� ���� class���� �⺻ �����ڰ� �־�� �Ѵ�.
	
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
