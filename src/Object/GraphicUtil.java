package Object;

import java.util.Scanner;

public class GraphicUtil {

	public GraphicUtil() {

	}

	public int scanInt() {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		return num;
	}

	public void choice() {

		Execute ex = new Execute();
		
		while (true) {
			System.out.print("Choose :: 1.Insert 2.Remove 3.Display 4.Exit >>> ");
			int type = scanInt();

			switch (type) {
			case 1:
				ex.insert();
				break;
			case 2:
				if(!ex.remove()) {
					System.out.println("Enable to Remove // " + getClass().getName());
				}
				break;
			case 3:
				ex.display();
				break;
			case 4:
				ex.exit();
				break;
			default:
				System.out.println("ERROR");
			}
		}
	}
}
