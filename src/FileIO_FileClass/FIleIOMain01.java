package FileIO_FileClass;

import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * 
 * Scanner class�������� ��� Ű���带 ���� �Է� �޾�����.
 * 
 */
public class FIleIOMain01 {

	public static void main(String[] args) {
		
//		try {
//			InputStream is = System.in;
//			System.out.println("�Է� �ϼ���(ctrl + z �Է½� ����)");
//			while(true) {
//				/*
//				 * ����Ʈ ������ �д´�.
//				 * int������ �޴� ������ ���̻� ���� �� �� ���ٸ� -1�� return�ϱ⶧��.
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
			 * ���⼭ ����Ʈ ������ ���ڷ� ��ȯ�����ش�.
			 * InputStreamReader�� ���⼭ ���� ������ �Ѵ�.
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
