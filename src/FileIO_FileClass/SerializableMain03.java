package FileIO_FileClass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import FileIOUtile.FileClose;

/*
 * 
 * 원하는 data만 출력 하기. 
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

	//직렬화 하는  class
	public static void write() {
		
		Song s = new Song();
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("iotest/직렬화 예제2-1.txt");
			oos = new ObjectOutputStream(fos);
			
			System.out.println("원하는 data만 직렬화 시키기");
			
			s.arr[0][0] = 1;
			s.arr[1][1] = 1;
			s.arr[2][2] = 1;
			s.arr[3][3] = 1;
			s.arr[4][4] = 1;
			
			oos.writeObject(s);
			
			System.out.println("직렬화 완료....");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(oos,fos);
		}
	}
	
	//역직렬화 하는 class
	public static void read() {
		
		//역직렬화 실행시(readObject)실행시 생성자는 호출되지 않는다.
		//생성자가 호출된다는 것은 다시 초기화가 이루어 지기 때문이다.
		//이미 write를 통해서 값을 초기화 했는데 이 값들을 그대로 사용해야하기 때문이다.
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			
			fis = new FileInputStream("iotest/직렬화 예제2-1.txt");
			ois = new ObjectInputStream(fis);
			
			System.out.println("역직렬화 시작...");
		
			Song s = (Song)ois.readObject();
			
//			System.out.println(s);
			
			for(int i = 0; i<s.arr.length; i++) {
				for(int j = 0; j<s.arr[i].length; j++) {
					System.out.print(s.arr[i][j] + " ");
				}
				System.out.println();
			}
			
			System.out.println("역직렬화 완료...");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		write();
		read();
	}
}
