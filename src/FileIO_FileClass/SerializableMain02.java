package FileIO_FileClass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * ����Ʈ ����ȭ ��ī���� ����
 * 
 * ����ȭ �޼ҵ�, ������ȭ �޼ҵ带 ����ȭ ����class�� �߰��Ͽ�
 * ���ϴ� data�� ����ȭ �ϴ� ���.
 * 
 * ���⼭�� 2���� �迭 �� 0�̾ƴ� �͸� ����ȭ �ϰ� �ʹ�.
 */

class TwoDArr implements Serializable { // ���� �����Ƿ� ����ȭ ���� class�̴�.

	int[][] tArr;

	TwoDArr() {
		this.tArr = new int[10][10];
//		tArr[1][9] = 10;
//		tArr[5][5] = 15;
//		tArr[6][9] = 3;
//		tArr[4][8] = 1;
	}

	// ����� ���� writeObject()
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

	// ����ȭ �޼ҵ�.
	public static void write() {

		TwoDArr td = new TwoDArr();

		try (FileOutputStream fos = new FileOutputStream("iotest/����ȭ ����2.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);

		) {
			System.out.println("���ϴ� data�� ����ȭ ����...");
			td.tArr[1][9] = 10;
			td.tArr[5][5] = 15;
			td.tArr[6][9] = 3;
			td.tArr[4][8] = 1;
			/*
			 * ���⼭ writeObject���󰡺��� ���ǿ� ���� ����ڰ� ����ȭ ���� class���� ������ writeObject() ȣ���Ѵ�.
			 */
			oos.writeObject(td);
			System.out.println("����ȭ �Ϸ�.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void read() {

		try (FileInputStream fis = new FileInputStream("iotest/����ȭ ����2.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);

		) {
			System.out.println("���ϴ� data�� ������ȭ ����...");
			TwoDArr td = (TwoDArr)ois.readObject();
			
			for(int i = 0; i<td.tArr.length; i++) {
				for(int j = 0; j<td.tArr[i].length; j++) {
					System.out.print(td.tArr[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("���ϴ� data�� ������ȭ �Ϸ�...");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		write();
		read();
	}
}
