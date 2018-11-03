package Object;

public abstract class DObject {
	
	private DObject next;
	
	public DObject() {
		this.next = null;
	}
	
	public void setNext(DObject obj) {
		this.next = obj;
	}
	
	public DObject getNext() {
		return next;
	}
	
	public abstract void show();
}
