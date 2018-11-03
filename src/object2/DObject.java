package object2;

public abstract class DObject {

	private DObject next;
	
	public DObject() {
		next = null;
	}
	
	public void setNext(DObject obj) {
		next = obj;
	}
	
	public DObject getNext() {
		return next;
	}
	
	public abstract void draw();
}
