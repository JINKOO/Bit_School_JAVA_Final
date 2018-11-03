package FileIO_FileClass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Member {
	
	private String University;
	private String major;
	
	/**
	 * 역직렬화 메커니즘에 의한(객체가 역직렬화 될때에는 직렬화 가능 class의 생성자는 호출되지 않지만
	 * 직렬화가 불가능한 가장 가까운 슈퍼class의 기본 생성자가 호출된다.)
	 * 직렬화 가능 하지 않는 class의 기본 생성자.
	 */
	
	Member() {
	}
	
	Member(String University, String major) {
		this.University = University;
		this.major = major;
	}

	public String getUniversity() {
		return University;
	}

	public void setUniversity(String university) {
		University = university;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
}

class Student extends Member implements java.io.Serializable{
	
/**
	 * 
	 */
	private static final long serialVersionUID = 8531960908220412798L;
	
	private String name;
	private int age; 
	private String subMajor;
	

	Student(String University, String major, String name, int age, String subMajor) {
		super(University, major);
		this.name = name;
		this.age = age;
		this.subMajor = subMajor;
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

	public String getSubMajor() {
		return subMajor;
	}

	public void setSubMajor(String subMajor) {
		this.subMajor = subMajor;
	}	
	
	//부모의 필드 직렬화 시키는 코드가 필요하다.
	private void writeObject(ObjectOutputStream oos) throws Exception {
		oos.writeUTF(getUniversity());
		oos.writeUTF(getMajor());
		
		oos.writeUTF(name);
		oos.writeInt(age);
		oos.writeUTF(subMajor);
	}
	
	private void readObject(ObjectInputStream ois) throws Exception {
		
		/*
		 * 순서 중요함.
		 */
		setUniversity(ois.readUTF());
		setMajor(ois.readUTF());
		
		name = ois.readUTF();
		age = ois.readInt();
		subMajor = ois.readUTF();
	}
}

public class SerializableMain05 {

	public static void write() {
		
		Student st = new Student("상명대학교", "컴퓨터과학과", "고진권", 26, "휴먼지능정보 공학");
		
		try (
				FileOutputStream fos = new FileOutputStream("iotest/직렬화 상속  예제.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
		) {	
			System.out.println("상속관계일때의 직렬화 시작...");
			
			oos.writeObject(st);
			
			System.out.println("상속관계일때의 직렬화 완료...");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void read() {
	
		FileInputStream fis = null;
		ObjectInputStream oos = null;
		
		try {
			
			fis = new FileInputStream("iotest/직렬화 상속  예제.txt");
			oos = new ObjectInputStream(fis);
			
			System.out.println("역직렬화 시작....");
			Student st = (Student)oos.readObject();
			
			/*
			 * 상속 관계에서 역직렬화 시.
			 * 생성자 호출 방법.
			 * -자바에서 역직렬화 할때 직렬화 가능 class의 생성자는 호출되지 않는다.
			 * -직렬화가 불가능한 가장 가까운 Super class의 기본 생성자가 자동으로 호출된다.
			 */
			
			System.out.println("학교명 : " + st.getUniversity());
			System.out.println("전   공 : " + st.getMajor());
			System.out.println("이   름 : " + st.getName());
			System.out.println("나   이 : " + st.getAge());
			System.out.println("부전공 : " + st.getSubMajor());
			
			System.out.println("역직렬화 완료....");
			
			/*
			 * 직렬화 가능하지 않는 class에 기본 생성자 추가.
			 */
			
			/*
			 * 슈퍼 class에 기본 생성자를 추가 하였지만.
			 * 역직렬화가 제대로 되지 않는다.
			 * 이유: 슈퍼 class의 필드는 직렬화 가능하지 않은 class의 필드이기 때문이다.
			 *  
			 *      => 직렬화 가능 class에 직렬화, 역직렬화 메소드를 추가한다.
			 *         여기서 직렬화 가능 class(자식 class)는 어짜피 상속받은 class이고
			 *         부모로 부터상속받은 모든 필드를 가지고 있다.
			 *         
			 *         따라서 자식class에서 직렬화, 역직렬화 메소드를 작성하고 이부분에서
			 *         부모class의 필드(멤버변수)를 직렬화,역직렬화 시켜준다.
			 *         
			 */
			
			/*
			 * 자식 class에(현재 직렬화 가능한 class이기 때문) 직렬화, 역직렬화 메소드를 추가한다.
			 */
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(oos != null) {
				try {
					
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		write();
		read();
	}
}
