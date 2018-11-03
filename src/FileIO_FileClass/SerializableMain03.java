package FileIO_FileClass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import FileIOUtile.FileClose;

/*
 * 
 * ���ϴ� data�� ��� �ϱ�. 
 * 
 * 
 */
class Song implements Serializable{
	
	int [][]arr;
	
	Song() {
		this.arr = new int[10][10];
	}
	
	private void writeObject(ObjectOutputStream oos) throws Exception {
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				if(arr[i][j] != 0) {
					oos.writeInt(i);
					oos.writeInt(j);
					oos.writeInt(arr[i][j]);
				}
			}
		}
	}
	
	private void readObject(ObjectInputStream ois) throws Exception {
		
		arr = new int[10][10];
		
		try {
			while(true) {
				int i = ois.readInt();
				int j = ois.readInt();
				int value = ois.readInt();
				arr[i][j] = value;
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

public class SerializableMain03 {

	//����ȭ �ϴ�  class
	public static void write() {
		
		Song s = new Song();
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("iotest/����ȭ ����2-1.txt");
			oos = new ObjectOutputStream(fos);
			
			System.out.println("���ϴ� data�� ����ȭ ��Ű��");
			
			s.arr[0][0] = 1;
			s.arr[1][1] = 1;
			s.arr[2][2] = 1;
			s.arr[3][3] = 1;
			s.arr[4][4] = 1;
			
			oos.writeObject(s);
			
			System.out.println("����ȭ �Ϸ�....");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(oos,fos);
		}
	}
	
	//������ȭ �ϴ� class
	public static void read() {
		
		//������ȭ �����(readObject)����� �����ڴ� ȣ����� �ʴ´�.
		//�����ڰ� ȣ��ȴٴ� ���� �ٽ� �ʱ�ȭ�� �̷�� ���� �����̴�.
		//�̹� write�� ���ؼ� ���� �ʱ�ȭ �ߴµ� �� ������ �״�� ����ؾ��ϱ� �����̴�.
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			
			fis = new FileInputStream("iotest/����ȭ ����2-1.txt");
			ois = new ObjectInputStream(fis);
			
			System.out.println("������ȭ ����...");
		
			Song s = (Song)ois.readObject();
			
//			System.out.println(s);
			
			for(int i = 0; i<s.arr.length; i++) {
				for(int j = 0; j<s.arr[i].length; j++) {
					System.out.print(s.arr[i][j] + " ");
				}
				System.out.println();
			}
			
			System.out.println("������ȭ �Ϸ�...");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		write();
		read();
	}
}
