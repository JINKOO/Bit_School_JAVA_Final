package FileIO_FileClass;

import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * 
 * Scanner class이전에는 어떻게 키보드를 통해 입력 받았을까.
 * 
 */
public class FIleIOMain01 {

	public static void main(String[] args) {
		
//		try {
//			InputStream is = System.in;
//			System.out.println("입력 하세요(ctrl + z 입력시 종료)");
//			while(true) {
//				/*
//				 * 바이트 단위로 읽는다.
//				 * int형으로 받는 이유는 더이상 읽을 것 이 없다면 -1을 return하기때문.
//				 * 
//				 */
//				int c = is.read();
//				if(c == -1) {
//					break;
//				}
//				System.out.print((char)c);
//			}
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
		
		InputStream is = null;
		InputStreamReader isr = null;
		
		try {
			is = System.in;
			/*
			 * 여기서 바이트 단위를 문자로 변환시켜준다.
			 * InputStreamReader는 여기서 필터 역할을 한다.
			 */
			isr = new InputStreamReader(is);
			
			while(true) {
				int c = isr.read();
				if(c == -1)
					break;
				System.out.print((char)c);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
