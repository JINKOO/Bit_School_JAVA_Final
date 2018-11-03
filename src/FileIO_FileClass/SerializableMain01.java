package FileIO_FileClass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import FileIOUtile.FileClose;

/**
 * 직렬화 가능 class
 * @author user
 *
 */

class GoodsInfo implements Serializable {
	
	private String code;
	private transient int price;
	private String name;
	
	GoodsInfo(String code, int price, String name) {
		this.code = code;
		this.price = price;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
public class SerializableMain01 {

	public static void write() {
		
		GoodsInfo gi = new GoodsInfo("ISBN1000-2321", 30_000, "뇌를 자극하는 JAVA프로그래밍"); 
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			
			fos = new FileOutputStream("iotest/직렬화 예제.txt");
			oos = new ObjectOutputStream(fos);
			
			System.out.println("GoodsInfo() 직렬화 시작");
			oos.writeObject(gi);
			oos.flush();
			System.out.println("GoodsInfo() 직렬화 완료");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(oos, fos);
		}
	}
	
	
	public static void read() {
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			
			fis = new FileInputStream("iotest/직렬화 예제.txt");
			ois = new ObjectInputStream(fis);
			
			GoodsInfo gi = (GoodsInfo)ois.readObject();
			System.out.println("역직렬화 시작...");
			System.out.println("ISBN : " + gi.getCode());
			System.out.println("Price : " + gi.getPrice());
			System.out.println("Name : " + gi.getName());
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(fis, ois);
		}
	}
	public static void main(String[] args) {
		
		write();
		read();
	}
}
