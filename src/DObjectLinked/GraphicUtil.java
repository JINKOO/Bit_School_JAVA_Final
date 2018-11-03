package DObjectLinked;

import java.util.Scanner;

public class GraphicUtil {

	private static DObject start;
	private static DObject end;

	public GraphicUtil() {
		start = null;
		end = null;
	}

	public int scanInt() {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		return num;
	}

	public void execute() {
		while (true) {
			System.out.print("���� :: 1.Insert  2.Remove  3.Display  4.Exit >>> ");
			int type = scanInt();

			switch (type) {
			case 1:
				insert();
				break;
			case 2:
				if(!remove()) {
					System.out.println("������ ������ �����ϴ�.");
				}
				break;
			case 3:
				display();
				break;
			case 4:
				exit();
				break;
			}
		}
	}

	public void exit() {
		System.out.println("EXIT...");
		System.exit(0);
	}

	public void insert() {

		System.out.print("TO insert :: 1.Line  2.Rect  3.Circle >>> ");
		int type = scanInt();

		DObject obj = null;

		switch (type) {
		case 1:
			obj = new Line();
			break;
		case 2:
			obj = new Rect();
			break;
		case 3:
			obj = new Circle();
			break;
		}

		if (start == null) { // List�� �ƹ� �͵� �������� insert
			start = obj;
			end = obj;
		} else { // 1���̻��� ��ü�� �̹� ���� ����.
			end.setNext(obj);
			end = obj;
		}
	}

	public boolean remove() {

		DObject current = start;
		DObject previous = start;

		System.out.print("������ ������ ��ġ�� �Է� �ϼ��� >>> ");
		int index = scanInt();

		if (start == null) { // List�� �ƹ��͵� ���� ���.
//			System.out.println("���� ����Ʈ�� �ƹ��͵� �����ϴ�.");
			return false;
		}

		// ����Ʈ�� �Ѱ��� ���� �ϴ� ���. ������ ��Ҹ� Ž���ؾ��Ѵ�.
		for (int i = 0; i < index; i++) {
			previous = current;
			current = current.getNext();
			if (current == null) {
//				System.out.println("�ε��� ������ �ʰ��Ͽ����ϴ�.");
				return false;
			}
		}

		// ����Ʈ�� �Ѱ��� �����ϴ� ���.
		if (start == end) {
			start = null;
			end = null;
			return true;
		}

		// ����Ʈ�� 1���̻�  ����
		if (current == start) {
			start = start.getNext();
		} else if (current == end) {
			end = previous;
			end.setNext(null);
		} else {
			previous.setNext(current.getNext());
		}
		return true;
	}

	public void display() {
		DObject p = start;
		while (p != null) {
			p.draw();
			p = p.getNext();
		}
	}
}
