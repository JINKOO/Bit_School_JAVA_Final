package FileIO_FileClass;

import java.io.Serializable;

/*
 * ����ȭ class
 * ���� : serializeable class �����ؾ��Ѵ�.
 * ����ȭ ���� class�� ������ȭ�� �����ϴ�.
 * 
 * ����ȭ : ��ü�� ��Ʈ������(��ü�� ���Ͽ� �����Ѵ�.) : 
 * ������ȭ : ���Ͽ� ����� ��ü�� �ٽ� ���α׷����� ����� �� �ֵ��� �Ѵ�.
 */

public class KO implements Serializable{

	private String name;
	private int age;
	private String phone;
	
	public KO() {
		
	}
	
	public KO(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "name : " + name + ", age : " + age + ", phone : " + phone;
	}
}
