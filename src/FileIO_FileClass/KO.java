package FileIO_FileClass;

import java.io.Serializable;

/*
 * 직렬화 class
 * 조건 : serializeable class 구현해야한다.
 * 직렬화 가능 class는 역직렬화도 가능하다.
 * 
 * 직렬화 : 객체를 스트림으로(객체를 파일에 저장한다.) : 
 * 역직렬화 : 파일에 저장된 객체를 다시 프로그램에서 사용할 수 있도록 한다.
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
