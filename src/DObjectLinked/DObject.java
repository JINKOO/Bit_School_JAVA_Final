package DObjectLinked;

/*
 * 
 * abstract 부모 class
 * Line Rect Circle에서 메소드 오버라이딩.
 * 링크연결하기 위한 참조변수형 변수가 필요하다.
 * 
 * 
 */
public abstract class DObject {

	private DObject next;
	
	public DObject() {
		
	}
	
	public void setNext(DObject obj) {
		this.next = obj;
	}

	public DObject getNext() {
		return next;
	}
	
	public abstract void draw();
}
