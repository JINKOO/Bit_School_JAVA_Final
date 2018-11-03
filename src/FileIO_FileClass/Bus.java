package FileIO_FileClass;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Bus extends Car implements Serializable{

	private String maxPerson;
	private boolean oil;   //������ true �ֹ��� �̸� false,
	
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
	 * ��� ���� �Ͻ�.
	 * �ڽ� class�� ����ȭ ���� class�̸� ����ȭ, ������ȭ �޼ҵ带 �ڽ� class�� ���� ����� �Ѵ�.
	 * 
	 */
	
	private void writeObject(ObjectOutputStream oos) throws Exception {
		
		oos.writeUTF(getCarNum());
		oos.writeUTF(getCompany());
		oos.writeInt(getPrice());
		//������� �θ�class�� �ʵ带 ����ȭ ���Ѿ��Ѵ�.
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
