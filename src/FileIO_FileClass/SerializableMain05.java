package FileIO_FileClass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Member {
	
	private String University;
	private String major;
	
	/**
	 * ������ȭ ��Ŀ���� ����(��ü�� ������ȭ �ɶ����� ����ȭ ���� class�� �����ڴ� ȣ����� ������
	 * ����ȭ�� �Ұ����� ���� ����� ����class�� �⺻ �����ڰ� ȣ��ȴ�.)
	 * ����ȭ ���� ���� �ʴ� class�� �⺻ ������.
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
	
	//�θ��� �ʵ� ����ȭ ��Ű�� �ڵ尡 �ʿ��ϴ�.
	private void writeObject(ObjectOutputStream oos) throws Exception {
		oos.writeUTF(getUniversity());
		oos.writeUTF(getMajor());
		
		oos.writeUTF(name);
		oos.writeInt(age);
		oos.writeUTF(subMajor);
	}
	
	private void readObject(ObjectInputStream ois) throws Exception {
		
		/*
		 * ���� �߿���.
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
		
		Student st = new Student("�����б�", "��ǻ�Ͱ��а�", "������", 26, "�޸��������� ����");
		
		try (
				FileOutputStream fos = new FileOutputStream("iotest/����ȭ ���  ����.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
		) {	
			System.out.println("��Ӱ����϶��� ����ȭ ����...");
			
			oos.writeObject(st);
			
			System.out.println("��Ӱ����϶��� ����ȭ �Ϸ�...");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void read() {
	
		FileInputStream fis = null;
		ObjectInputStream oos = null;
		
		try {
			
			fis = new FileInputStream("iotest/����ȭ ���  ����.txt");
			oos = new ObjectInputStream(fis);
			
			System.out.println("������ȭ ����....");
			Student st = (Student)oos.readObject();
			
			/*
			 * ��� ���迡�� ������ȭ ��.
			 * ������ ȣ�� ���.
			 * -�ڹٿ��� ������ȭ �Ҷ� ����ȭ ���� class�� �����ڴ� ȣ����� �ʴ´�.
			 * -����ȭ�� �Ұ����� ���� ����� Super class�� �⺻ �����ڰ� �ڵ����� ȣ��ȴ�.
			 */
			
			System.out.println("�б��� : " + st.getUniversity());
			System.out.println("��   �� : " + st.getMajor());
			System.out.println("��   �� : " + st.getName());
			System.out.println("��   �� : " + st.getAge());
			System.out.println("������ : " + st.getSubMajor());
			
			System.out.println("������ȭ �Ϸ�....");
			
			/*
			 * ����ȭ �������� �ʴ� class�� �⺻ ������ �߰�.
			 */
			
			/*
			 * ���� class�� �⺻ �����ڸ� �߰� �Ͽ�����.
			 * ������ȭ�� ����� ���� �ʴ´�.
			 * ����: ���� class�� �ʵ�� ����ȭ �������� ���� class�� �ʵ��̱� �����̴�.
			 *  
			 *      => ����ȭ ���� class�� ����ȭ, ������ȭ �޼ҵ带 �߰��Ѵ�.
			 *         ���⼭ ����ȭ ���� class(�ڽ� class)�� ��¥�� ��ӹ��� class�̰�
			 *         �θ�� ���ͻ�ӹ��� ��� �ʵ带 ������ �ִ�.
			 *         
			 *         ���� �ڽ�class���� ����ȭ, ������ȭ �޼ҵ带 �ۼ��ϰ� �̺κп���
			 *         �θ�class�� �ʵ�(�������)�� ����ȭ,������ȭ �����ش�.
			 *         
			 */
			
			/*
			 * �ڽ� class��(���� ����ȭ ������ class�̱� ����) ����ȭ, ������ȭ �޼ҵ带 �߰��Ѵ�.
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
