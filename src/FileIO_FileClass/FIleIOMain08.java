package FileIO_FileClass;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/*
 * 파일 입출력시 여러 파일입출력 class를 쓰게되면
 * finally부분의 close하는 코드가 너무 길어진다.
 * 
 * 1.7버전이후의 try-catch문쓰면 된다.
 * <<사용법>>
 *  try (
 *    
 *    반드시 close()를 해야하는 변수 설정.
 *    FileReader fr = new FileReader("파일 경로");
 *    BufferedReader br = new BufferedReader(fr);
 *    //fr은 나중에 close()를 수행해야 한다.
 *    
 *  ) { 
 *      //예외가 발생할 수 있는 부분.
 *   } catch(Exception e) {
 *     e.printStackTrace //예외 처리.
 *   }
 * 
 * 단. autoCloseable을 상속받아야 가능하다.
 */

public class FIleIOMain08 {

	/**
	 * 파일 복사.(읽어서 쓰기)
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
			System.out.println("파일 복사 완료...");
			
//			pw.close();
//			bw.close();
//			br.close();
//			fw.close();
//			fr.close();
			//굳이 안해도 된다.
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
