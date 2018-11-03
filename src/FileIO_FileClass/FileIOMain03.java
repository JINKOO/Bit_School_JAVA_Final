package FileIO_FileClass;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import FileIOUtile.FileClose;


/*
 * 
 * 사진 복사하는데
 * 필터인 buffer를 쓸 것이다.
 * 
 */

public class FileIOMain03 {
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			System.out.println("파일 복사 시작합니다.");
			long start = System.currentTimeMillis();
			
			fis = new FileInputStream("iotest/military_Copy.jpg");
			fos = new FileOutputStream("iotest/military_Copy2.jpg");
			
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			while(true) {
				int c = bis.read();
				if(c == -1) 
					break;
				bos.write(c);
			}
			
			fos.flush();
			bos.flush();
			
			long end = System.currentTimeMillis();
			System.out.println("파일 복사완료!");
			System.out.println("걸린 시간 : " + (end-start)/1000. + "초");
			
		} catch(Exception e) {
			e.printStackTrace();
		
		} finally {
			
			FileClose.close(bos, fos);
			FileClose.close(bis, fis);
			
//			if(fis != null) {
//				try {
//					fis.close();
//				} catch(Exception e) {
//					e.printStackTrace();
//				}
//			}
//			
//			if(fos != null) {
//				try {
//					fos.close();
//				} catch(Exception e) {
//					e.printStackTrace();
//				}
//			}
//			
//			if(bis != null) {
//				try {
//					bis.close();
//				} catch(Exception e) {
//					e.printStackTrace();
//				}
//			}
//			
//			if(bos != null) {
//				try {
//					bos.close();
//				} catch(Exception e) {
//					e.printStackTrace();
//				}
//			}
		}
	}
}
