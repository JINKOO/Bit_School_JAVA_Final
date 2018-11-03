package FileIO_FileClass;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/*
 * 
 * 
 * 문자 스트림.
 * FileReader, FileWriter.
 * 문자 단위로 읽는다.
 * 
 * 
 */
public class FileIOMain06 {

	// FileIOMain05.java -> FileIOMain05.java.Copy.txt
	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			
			if(args.length != 2) {
				System.out.println("사용법이 잘 못 되었습니다.");
				System.out.println("\t올바른 사용법 : FileIOMain06.java  원본 파일 명    복사한 파일 명");
			}
			
			fr = new FileReader(args[0]);
			fw = new FileWriter(args[1]);
			
			while(true) {
				/*
				 * 여기서 버퍼를 끼지 않으면
				 * string 형으로 read write할 수 없다.
				 * buffer를 껴야가능하다.
				 */
				int c = fr.read();
				if(c == -1) {
					break;
				}
				fw.write(c);
			}
			
			fw.flush();
			System.out.println("파일 복 사 완료...");
			
		} catch(Exception e) {
			e.printStackTrace();
		
		} finally {
			if(fr != null) {
			    try {
					fr.close();
				} catch(Exception e) {
				e.printStackTrace();
				}
			}
			
			if(fw != null) {
				try {
					fw.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
