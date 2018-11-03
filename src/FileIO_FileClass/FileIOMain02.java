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
			System.out.println("파일 복사 완료하였습니다.");
			System.out.println("파일 복사하는 데 걸린 시간 : " + (end - start)/1000. + "초");
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
