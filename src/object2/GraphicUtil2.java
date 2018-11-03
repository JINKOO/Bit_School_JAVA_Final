package object2;

import java.util.Scanner;

public class GraphicUtil2 {

	private static DObject[] list;
	private static int index;

	public GraphicUtil2() {
		list = new DObject[3];
		index = 0;
	}

	private int scanInt() {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		return num;
	}

	public void remove() {
		System.out.print("<remove> :: location >>> ");
		int loca = scanInt();

		// list가 비어있는 경우.
		if (index == 0) {
			System.out.println("List is empty");
		} else if (loca < index) { 
			for (int i = loca; i < index; i++) {
				if(i != index - 1) {
					list[i] = list[i+1];
				} else {
					list[i] = null;
				}
			}
			index--;
		} else {
			System.out.println("OutofIndex");
			System.out.println("CurrentIndex is " + (index-1));
		}
	}

	public void insert() {
		System.out.print("<insert> :: 1.Line 2.Rect 3.Circle >>> ");
		int type = scanInt(); // type은 도형 선택 변수.

		if (index >= list.length) {
			System.out.println("OutOfIndex !!");
		} else {
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
			default:
				System.out.println("insert type isn't match...");
				System.out.println("input again");
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
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Do you wanna Quit??");
		System.out.print("Y :: Quit  ||  N :: Continue >>> ");
		String str = sc.nextLine();
		
		if(str.equals("y")) {
			System.out.println("GoodBye");
			System.exit(0);
		} else {
			return;
		}
		
	}

	public void execute() {

		while (true) {
			System.out.print("<MENU> :: 1.insert  2.remove  3.display  4.exit >>> ");
			int menu = scanInt();

			switch (menu) {
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
			default :
				System.out.println("Reenter the menu...");
			}
			System.out.println();
		}
	}
}

