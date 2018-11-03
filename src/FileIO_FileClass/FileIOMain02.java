package FileIO_FileClass;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIOMain02 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			
			fis = new FileInputStream("iotest/military2.jpg");
			fos = new FileOutputStream("iotest/military_copy.jpg");
			
			long start = System.currentTimeMillis();
			
			while(true) {
				int c = fis.read();
				if(c == -1) 
					break;
				fos.write(c);
			}
			fos.flush();
			
			long end = System.currentTimeMillis();
			System.out.println("���� ���� �Ϸ��Ͽ����ϴ�.");
			System.out.println("���� �����ϴ� �� �ɸ� �ð� : " + (end - start)/1000. + "��");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			if(fos != null) {
				try {
					fos.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
