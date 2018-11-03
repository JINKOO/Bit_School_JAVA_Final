package object2;

import java.util.Scanner;

public class GraphicUtil {

	private static DObject[] list;
	private static int index;

	public GraphicUtil() {
		list = new DObject[3];
		index = 0;
	}

	public int scanInt() {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		return num;
	}

	public void execute() {
		while (true) {
			System.out.print("MENU :: 1.Insert  2.Remove  3.Display  4.Exit >>> ");
			int num = scanInt();

			switch (num) {
			case 1:
				insert();
				break;
			case 2:
				remove();
				break;
			case 3:
				display();
				break;
			case 4:
				exit();
				break;
			default:
				System.out.println("Incorrect Input !!");
			}
			System.out.println();
		}
	}

	public void insert() {
		System.out.print("Choose :: 1.Line  2.Rect  3.Circle >>> ");
		int type = scanInt();

		if (index < list.length) {
			switch (type) {
			case 1:
				list[index++] = new Line();
				break;
			case 2:
				list[index++] = new Rect();
				break;
			case 3:
				list[index++] = new Circle();
				break;
			}
		}

		else {
			System.out.println("List is FULL...");
			System.out.println("Remove is Needed");
		}
	}

	public void remove() {
		System.out.print("Location(started at 0) >>> ");
		int loca = scanInt();

		if (loca >= list.length) {
			System.out.println("Incorrect Access");
		}

		else {
			// List가 비어있는 경우.
			if (index == 0) {
				System.out.println("List is Empty!");

			} else { // List에 한개 이상 존재.
				if (index == 1) { // List에 한개만 존재.
					list[loca] = null;
				} else { // List에 여러개가 존재.
					if (loca == 0) { // 맨 처음것 삭제
						for (int i = loca; i < list.length; i++) {
							if (i != list.length - 1) {
								list[loca] = list[loca + 1];
							} else {
								list[loca] = null;
							}
						}
					} else if (loca == list.length - 1) { // 맨 끝에것 삭제.
						list[loca] = null;
					} else { // 중간것 삭제.
						for (int i = loca; i < list.length; i++) {
							if (i != list.length - 1) {
								list[loca] = list[loca + 1];
							} else {
								list[loca] = null;
							}
						}
					}
					index--;
				}
			}
		}
	}

	public void display() {
		for (DObject child : list) {
			if (child != null) {
				child.draw();
			}
		}
	}

	public void exit() {
		System.out.println("System Will be terminate!");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Good-Bye ~");
			System.exit(0);
		}
	}
}
