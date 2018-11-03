package Object;

import java.util.Scanner;

public class Execute {

	private DObject start = null;
	private DObject end = null;
	
	public Execute() {
		
	}
	
	public int scanInt() {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		return num;
	}
	
	public void insert() {
		System.out.print("Select :: 1.Line 2.Rect 3.Circle");
		int type = scanInt();
		
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
			start = obj;
			end = obj;
		} else {
			end.setNext(obj);
			end = obj;
		}
	}
	
	public boolean remove() {
		
		DObject current = start;
		DObject previous = start;
		
		System.out.print("삭제할 도형 위치 : ");
		int index = scanInt();
		
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
			start = null;
			end = null;
			return true;
		}
		
		if(current == start) {
			start = start.getNext();
		} else if(current == end) {
			end = previous;
			end.setNext(null);
		} else {
			previous.setNext(current.getNext());
		}
		return true;
	}
	
	public void display() {
		
		DObject p = start;
		while(p != null) {
			p.show();
			p = p.getNext();
		}
	}
	
	public void exit() {
		System.out.println("System Will be Terminate...");
		try {
			Thread.sleep(2000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.exit(0);
	}
}
