package FileIO_FileClass;

import java.io.FileInputStream;
/*
 * 
 * byte 스트림 class.
 * 
 * byte스트림에서 read write는 무조건 한 바이트씩 읽어 들인다.
 * 
 */
import java.io.FileOutputStream;

public class FileIOMain04 {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		FileInputStream fis = null;
		
		try {
			
			/*
			 * FileOutputStream("파일 경로" , boolean bool)
			 * bool이 true면 append기능 지원한다.
			 * false면 다시 실행 했을 시에 덮어쓰기.
			 */
			
			fos = new FileOutputStream("iotest/a.txt",true);
			fis = new FileInputStream("iotest/a.txt");
			
			fos.write('A');
			fos.write(' ');
			fos.write('B');
			fos.write('C');
			fos.write(65);
			fos.write('=');
			
			System.out.println("파일 저장 완료...");
			System.out.println("파일 읽기 시작...");
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
