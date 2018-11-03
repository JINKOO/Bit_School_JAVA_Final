package FileIO_FileClass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 디폴트 직렬화 메카니즘 말고
 * 
 * 직렬화 메소드, 역직렬화 메소드를 직렬화 가능class에 추가하여
 * 원하는 data만 직렬화 하는 기능.
 * 
 * 여기서는 2차원 배열 중 0이아닌 것만 직렬화 하고 싶다.
 */

class TwoDArr implements Serializable { // 구현 했으므로 직렬화 가능 class이다.

	int[][] tArr;

	TwoDArr() {
		this.tArr = new int[10][10];
//		tArr[1][9] = 10;
//		tArr[5][5] = 15;
//		tArr[6][9] = 3;
//		tArr[4][8] = 1;
	}

	// 사용자 정의 writeObject()
	private void writeObject(ObjectOutputStream oos) throws Exception {
		for (int i = 0; i < tArr.length; i++) {
			for (int j = 0; j < tArr[i].length; j++) {
				if (tArr[i][j] != 0) {
					oos.writeInt(i);
					oos.writeInt(j);
					oos.writeInt(tArr[i][j]);
				}
			}
		}
	}

	private void readObject(ObjectInputStream ois) throws Exception {
		tArr = new int[10][10];

		try {
			while (true) {
				int i = ois.readInt();
				int j = ois.readInt();
				int value = ois.readInt();
				tArr[i][j] = value;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class SerializableMain02 {

	// 직렬화 메소드.
	public static void write() {

		TwoDArr td = new TwoDArr();

		try (FileOutputStream fos = new FileOutputStream("iotest/직렬화 예제2.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);

		) {
			System.out.println("원하는 data만 직렬화 시작...");
			td.tArr[1][9] = 10;
			td.tArr[5][5] = 15;
			td.tArr[6][9] = 3;
			td.tArr[4][8] = 1;
			/*
			 * 여기서 writeObject따라가보면 조건에 따라 사용자가 직렬화 가능 class에서 정의한 writeObject() 호출한다.
			 */
			oos.writeObject(td);
			System.out.println("직렬화 완료.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void read() {

		try (FileInputStream fis = new FileInputStream("iotest/직렬화 예제2.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);

		) {
			System.out.println("원하는 data만 역직렬화 시작...");
			TwoDArr td = (TwoDArr)ois.readObject();
			
			for(int i = 0; i<td.tArr.length; i++) {
				for(int j = 0; j<td.tArr[i].length; j++) {
					System.out.print(td.tArr[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("원하는 data만 역직렬화 완료...");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		write();
		read();
	}
}
