package FileIO_FileClass;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import FileIOcloseUtil.FileClose;

/*
 * printWriter�� �̿��Ͽ� 
 * write�Ҷ� ���� �ڵ�����.
 */
public class FileIOMain07 {

	/**
	 * src/FileIO_FileClass/FileIOMain06.java ==> iotest/printWrtierExample.txt
	 * @param args
	 */
	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try {
			
			fr = new FileReader("src/FileIO_FileClass/FileIOMain06.java");
			fw = new FileWriter("iotest/printWriterExample");
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			
			while(true) {
				String str = br.readLine();
				if(str == null) {
					break;
				}
				pw.println(str);
			}
			pw.flush();
			System.out.println("���� ���� �Ϸ�...");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(pw, bw, fw);
			FileClose.close(br, fr);
		}
	}
}
