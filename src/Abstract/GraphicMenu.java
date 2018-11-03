package Abstract;

import java.util.Scanner;

public class GraphicMenu {

	private GraphicManager gm;

	public GraphicMenu() {
		this.gm = new GraphicManager();
	}

	public int scanInt() {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		return num;
	}

	public void execute() {

		while (true) {
			System.out.println("����(1)  /  ����(2)  /  ��� ����(3)  /  ����(4) >>> ");
			int type = scanInt();

			switch (type) {
			case 1:
				gm.choice();
				break;
			case 2:
				break;
			case 3:
				gm.displayAll();
				break;
			case 4:
				gm.exit();
				break;
			}
		}
	}
}
