package FileIO_FileClass;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Bus extends Car implements Serializable{

	private String maxPerson;
	private boolean oil;   //경유면 true 휘발유 이면 false,
	
	public Bus(String CarNum, String Company, int price, String maxPerson, boolean oil) {
		super(CarNum, Company, price);
		this.maxPerson = maxPerson;
		this.oil = oil;
	}

	public String getMaxPerson() {
		return maxPerson;
	}

	public void setMaxPerson(String maxPerson) {
		this.maxPerson = maxPerson;
	}

	public boolean isOil() {
		return oil;
	}

	public void setOil(boolean oil) {
		this.oil = oil;
	}
	
	/*
	 * 상속 관계 일시.
	 * 자식 class가 직렬화 가능 class이면 직렬화, 역직렬화 메소드를 자식 class에 구현 해줘야 한다.
	 * 
	 */
	
	private void writeObject(ObjectOutputStream oos) throws Exception {
		
		oos.writeUTF(getCarNum());
		oos.writeUTF(getCompany());
		oos.writeInt(getPrice());
		//여기까지 부모class의 필드를 직렬화 시켜야한다.
		oos.writeUTF(maxPerson);
		oos.writeBoolean(oil);
	}
	
	private void readObject(ObjectInputStream ois) throws Exception {
		
//		CarNum = ois.readUTF();
//		Company = ois.readUTF();
//		price = ois.readInt();
//		maxPerson = ois.readUTF();
//		oil = ois.readBoolean();
		
		setCarNum(ois.readUTF());
		setCompany(ois.readUTF());
		setPrice(ois.readInt());
		
		ois.defaultReadObject();
//		maxPerson = ois.readUTF();
//		oil = ois.readBoolean();
	}
}
