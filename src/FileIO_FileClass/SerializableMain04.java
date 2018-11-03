package FileIO_FileClass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * 상속 관계있을때 직렬화 하는 방법.
 * 자식 class가 직렬화 가능 class
 * 직렬화 메소드 역직렬화 메소드를 따로 작성 한다.
 */
public class SerializableMain04 {
	
	public static void write() {
		
		Bus bus = new Bus("19국 2645", "Hyundai", 100_0000, "45인승", true);
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			
			fos = new FileOutputStream("iotest/차량 조회서.txt");
			oos = new ObjectOutputStream(fos);
			
			System.out.println("직렬화 시작...");
			oos.writeObject(bus);
			System.out.println("직렬화 완료...");
			
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
			
			fis = new FileInputStream("iotest/차량 조회서.txt");
			ois = new ObjectInputStream(fis);
			
			System.out.println("역직렬화 시작 ...");
			Bus bus = (Bus)ois.readObject();
			
			System.out.println("차량 번호 : " + bus.getCarNum());
			System.out.println("제작 회사: " + bus.getCompany());
			System.out.println("차량 견적 : " + bus.getPrice());
			System.out.println("차량 인승: " + bus.getMaxPerson());
			System.out.println("경유 여부 : " + bus.isOil());
			
			System.out.println("역직렬화 완료 ...");
			
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
