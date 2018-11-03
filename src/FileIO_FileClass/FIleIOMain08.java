package FileIO_FileClass;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/*
 * ���� ����½� ���� ��������� class�� ���ԵǸ�
 * finally�κ��� close�ϴ� �ڵ尡 �ʹ� �������.
 * 
 * 1.7���������� try-catch������ �ȴ�.
 * <<����>>
 *  try (
 *    
 *    �ݵ�� close()�� �ؾ��ϴ� ���� ����.
 *    FileReader fr = new FileReader("���� ���");
 *    BufferedReader br = new BufferedReader(fr);
 *    //fr�� ���߿� close()�� �����ؾ� �Ѵ�.
 *    
 *  ) { 
 *      //���ܰ� �߻��� �� �ִ� �κ�.
 *   } catch(Exception e) {
 *     e.printStackTrace //���� ó��.
 *   }
 * 
 * ��. autoCloseable�� ��ӹ޾ƾ� �����ϴ�.
 */

public class FIleIOMain08 {

	/**
	 * ���� ����.(�о ����)
	 * src/FileIO_FileClass/FileIOMain07.java ==> iotest/1.5Ver_try-catch.java
	 * @param args
	 */
	public static void main(String[] args) {
		
		try (
				FileReader fr = new FileReader("src/FileIO_FileClass/FileIOMain07.java");
				FileWriter fw = new FileWriter("iotest/1.5Ver_try-catch.java");
				BufferedReader br = new BufferedReader(fr);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);
		) {
			
			while(true) {
				String str = br.readLine();
				if(str == null) {
					break;
				}
				
				pw.println(str);
			}
			pw.flush();
			System.out.println("���� ���� �Ϸ�...");
			
//			pw.close();
//			bw.close();
//			br.close();
//			fw.close();
//			fr.close();
			//���� ���ص� �ȴ�.
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
