package FileIO_FileClass;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import FileIOUtile.FileClose;


/*
 * 
 * ���� �����ϴµ�
 * ������ buffer�� �� ���̴�.
 * 
 */

public class FileIOMain03 {
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			System.out.println("���� ���� �����մϴ�.");
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
			System.out.println("���� ����Ϸ�!");
			System.out.println("�ɸ� �ð� : " + (end-start)/1000. + "��");
			
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
