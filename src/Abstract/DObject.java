package Abstract;

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
