package Abstract;
import java.util.Scanner;

public class GraphicManager {
	
	private static DObject start = null;
	private static DObject end = null;
	
	public GraphicManager() {

	}
	
	public int scanInt() {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		return num;
	}
	
	public void choice() {
		System.out.println("도형 종류  :: Line(1), Rect(2), Circle(3) >>> ");
		int type = scanInt();
		insert(type);
	}
	
	public void choice2() {
		System.out.println("삭제할 도형 위치  :: Line(1), Rect(2), Circle(3) >>> ");
		int index = scanInt();
		remove(index);
	}
	
	
	
	public void insert(int type) {
		DObject obj = null;
		switch(type) {
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
		
		if(start == null) {
			start = end = obj;
		} else {
			end.setNext(obj);
			end = obj;
		}
	}
	
	public boolean remove(int index) {
		DObject current = start;
		DObject previous = start;
		
		if(start == null) {
			return false;
		}
		
		for(int i = 0; i<index; i++) {
			previous = current;
			current = current.getNext();
			if(current == null) {
				return false;
			}
		}
		
		if(start == end) {
			start = end = null;
			return true;
		}
		
		if(current == start) {
			start = start.getNext();
		} else if (current == end) {
			end = previous;
			end.setNext(null);
		} else {
			previous.setNext(current.getNext());
		}
		return true;
	}
	
	public void displayAll() {
		DObject p = start;
		while( p!=null) {
			p.draw();
			p = p.getNext();
		}
	}
	
	public void exit() {
		System.out.println("프로그램이 종료됩니다.");
		System.exit(0);
	}
}
