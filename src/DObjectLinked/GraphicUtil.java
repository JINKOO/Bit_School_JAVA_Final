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
			System.out.print("선택 :: 1.Insert  2.Remove  3.Display  4.Exit >>> ");
			int type = scanInt();

			switch (type) {
			case 1:
				insert();
				break;
			case 2:
				if(!remove()) {
					System.out.println("삭제할 도형이 없습니다.");
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

		if (start == null) { // List에 아무 것도 없을때의 insert
			start = obj;
			end = obj;
		} else { // 1개이상의 객체가 이미 들어와 있음.
			end.setNext(obj);
			end = obj;
		}
	}

	public boolean remove() {

		DObject current = start;
		DObject previous = start;

		System.out.print("삭제할 도형의 위치를 입력 하세요 >>> ");
		int index = scanInt();

		if (start == null) { // List에 아무것도 없는 경우.
//			System.out.println("현재 리스트에 아무것도 없습니다.");
			return false;
		}

		// 리스트에 한개라도 존재 하는 경우. 삭제할 요소를 탐색해야한다.
		for (int i = 0; i < index; i++) {
			previous = current;
			current = current.getNext();
			if (current == null) {
//				System.out.println("인덱스 범위를 초과하였습니다.");
				return false;
			}
		}

		// 리스트에 한개만 존재하는 경우.
		if (start == end) {
			start = null;
			end = null;
			return true;
		}

		// 리스트에 1개이상  존재
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
