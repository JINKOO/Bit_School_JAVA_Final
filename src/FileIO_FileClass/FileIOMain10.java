package FileIO_FileClass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import FileIOUtile.FileClose;


public class FileIOMain10 {

	/**
	 * ��ü�� ����ȭ ��Ű�� class.
	 * 
	 * @throws Exception
	 */
	public static void write() {
		
		KO ko = new KO("������", 26, "010-3187-5668");
		//autocloseable ��� �����Ƿ� close ���� ���ص� �ȴ�.(1.7���������� try-catch��)
		try (
				FileOutputStream fos = new FileOutputStream("iotest/Serializable2.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
		) {
			System.out.println("��ü ����ȭ ���� ....");
			oos.writeObject(ko);
			oos.flush();
			System.out.println("��ü ����ȭ �Ϸ�....");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void read() {
		
		try (
				FileInputStream fis = new FileInputStream("iotest/Serializable2.txt");
				ObjectInputStream ois = new ObjectInputStream(fis)
		) {
			
			System.out.println("������ȭ ����...");
			KO ko = (KO)ois.readObject();
			System.out.println(ko);
			System.out.println("������ȭ �Ϸ�...");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		write();
		System.out.println("==========================");
		read();
	}
}
