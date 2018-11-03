package FileIO_FileClass;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 
 * DataInput,OutputStream
 * 
 * -filterclass이다.(독립적인 사용X)
 * -기존방식인 char, byte단위로만 파일 읽기 쓰기가 가능했지만
 *  다른 타입으로도 파일 입출력을 가능하게 해준다.(기본 자료형 + String형). 다른 참조형은 X.
 * -파일 쓰기시 서로다른 기본 자료형 여러개로 했다면
 *  이 파일을 읽을때 어떤 자료형이 언제 쓰이는지 순서가 중요하다. 
 * 
 */
public class FileIOMain05 {

	public static void write() {

		FileOutputStream fos = null;
		DataOutputStream dos = null;

		try {

			fos = new FileOutputStream("iotest/Ko.txt");
			dos = new DataOutputStream(fos);

			dos.write(12);
			dos.writeInt(65);
			dos.writeInt(66);
			dos.writeChar('M');
			dos.writeBoolean(true);
			dos.writeUTF("hello");

			System.out.println("파일 쓰기 완료...");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (dos != null) {
				try {
					dos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			if (fos != null) {
				try {
					fos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void read() throws Exception {

		FileInputStream fis = null;
		DataInputStream dis = null;

		try {

			fis = new FileInputStream("iotest/Ko.txt");
			dis = new DataInputStream(fis);

			int c = dis.read();
			int i = dis.readInt();
			int i2 = dis.readInt();
			char ch = dis.readChar();
			boolean bool = dis.readBoolean();
			String str = dis.readUTF();

			System.out.println("바이트 단위 : " + c);
			System.out.println("int 단위 : " + i);
			System.out.println("int 단위 : " + i2);
			System.out.println("char 단위 : " + ch);
			System.out.println("boolean 단위 : " + bool);
			System.out.println("String 단위 : " + str);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (dis != null) {
				try {
					dis.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			if (fis != null) {
				try {
					fis.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {

		write();
		try {
			read();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
