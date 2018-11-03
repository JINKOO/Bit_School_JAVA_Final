package FileIO_FileClass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import FileIOUtile.FileClose;

/**
 * ����ȭ ���� class
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
		
		GoodsInfo gi = new GoodsInfo("ISBN1000-2321", 30_000, "���� �ڱ��ϴ� JAVA���α׷���"); 
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			
			fos = new FileOutputStream("iotest/����ȭ ����.txt");
			oos = new ObjectOutputStream(fos);
			
			System.out.println("GoodsInfo() ����ȭ ����");
			oos.writeObject(gi);
			oos.flush();
			System.out.println("GoodsInfo() ����ȭ �Ϸ�");
			
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
			
			fis = new FileInputStream("iotest/����ȭ ����.txt");
			ois = new ObjectInputStream(fis);
			
			GoodsInfo gi = (GoodsInfo)ois.readObject();
			System.out.println("������ȭ ����...");
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
