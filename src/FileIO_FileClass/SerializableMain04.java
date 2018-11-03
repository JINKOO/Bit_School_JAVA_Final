package FileIO_FileClass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * ��� ���������� ����ȭ �ϴ� ���.
 * �ڽ� class�� ����ȭ ���� class
 * ����ȭ �޼ҵ� ������ȭ �޼ҵ带 ���� �ۼ� �Ѵ�.
 */
public class SerializableMain04 {
	
	public static void write() {
		
		Bus bus = new Bus("19�� 2645", "Hyundai", 100_0000, "45�ν�", true);
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			
			fos = new FileOutputStream("iotest/���� ��ȸ��.txt");
			oos = new ObjectOutputStream(fos);
			
			System.out.println("����ȭ ����...");
			oos.writeObject(bus);
			System.out.println("����ȭ �Ϸ�...");
			
		} catch(Exception e) {
			e.printStackTrace();
		
		} finally {
			if(oos != null) {
				try {
					oos.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void read() {
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			
			fis = new FileInputStream("iotest/���� ��ȸ��.txt");
			ois = new ObjectInputStream(fis);
			
			System.out.println("������ȭ ���� ...");
			Bus bus = (Bus)ois.readObject();
			
			System.out.println("���� ��ȣ : " + bus.getCarNum());
			System.out.println("���� ȸ��: " + bus.getCompany());
			System.out.println("���� ���� : " + bus.getPrice());
			System.out.println("���� �ν�: " + bus.getMaxPerson());
			System.out.println("���� ���� : " + bus.isOil());
			
			System.out.println("������ȭ �Ϸ� ...");
			
		} catch(Exception e) {
			e.printStackTrace();
		
		} finally {
			if(ois != null) {
				try {
					ois.close();
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
