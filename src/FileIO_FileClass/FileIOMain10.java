package FileIO_FileClass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import FileIOUtile.FileClose;


public class FileIOMain10 {

	/**
	 * 객체를 직렬화 시키는 class.
	 * 
	 * @throws Exception
	 */
	public static void write() {
		
		KO ko = new KO("고진권", 26, "010-3187-5668");
		//autocloseable 상속 받으므로 close 따로 안해도 된다.(1.7버전이후의 try-catch문)
		try (
				FileOutputStream fos = new FileOutputStream("iotest/Serializable2.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
		) {
			System.out.println("객체 직렬화 시작 ....");
			oos.writeObject(ko);
			oos.flush();
			System.out.println("객체 직렬화 완료....");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void read() {
		
		try (
				FileInputStream fis = new FileInputStream("iotest/Serializable2.txt");
				ObjectInputStream ois = new ObjectInputStream(fis)
		) {
			
			System.out.println("역직렬화 시작...");
			KO ko = (KO)ois.readObject();
			System.out.println(ko);
			System.out.println("역직렬화 완료...");
			
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
