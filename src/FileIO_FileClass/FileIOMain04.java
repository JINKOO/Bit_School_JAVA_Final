package FileIO_FileClass;

import java.io.FileInputStream;
/*
 * 
 * byte ��Ʈ�� class.
 * 
 * byte��Ʈ������ read write�� ������ �� ����Ʈ�� �о� ���δ�.
 * 
 */
import java.io.FileOutputStream;

public class FileIOMain04 {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		FileInputStream fis = null;
		
		try {
			
			/*
			 * FileOutputStream("���� ���" , boolean bool)
			 * bool�� true�� append��� �����Ѵ�.
			 * false�� �ٽ� ���� ���� �ÿ� �����.
			 */
			
			fos = new FileOutputStream("iotest/a.txt",true);
			fis = new FileInputStream("iotest/a.txt");
			
			fos.write('A');
			fos.write(' ');
			fos.write('B');
			fos.write('C');
			fos.write(65);
			fos.write('=');
			
			System.out.println("���� ���� �Ϸ�...");
			System.out.println("���� �б� ����...");
			while(true) {
				int c = fis.read();
				if(c == -1)
					break;
				System.out.print((char)c);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			if(fos != null) {
				try {
					fos.close();
				} catch(Exception e) {
					e.printStackTrace();
				}	
			}
			
			if(fis != null) {
				try {
					fis.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
