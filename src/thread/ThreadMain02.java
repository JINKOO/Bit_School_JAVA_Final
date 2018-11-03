package thread;
/*
 *  Thread class
 *   
 *  ���� ������ ��� main Thread �ϳ� ����.
 *  ���� ���ʹ� ��Ƽ Thread���.
 *  ���δ� ���ÿ� �� ���� �̻��� ���� �ϴ� ���α׷��� �ʿ��ϴ�.
 *  
 *  
 *  <Main thread>
 *  1.�츮�� ���� �ƴ� main �޼ҵ� �̴�.
 *  2.���α׷��� ���۵Ǹ� �ڵ����� ���۵ȴ�. (�ٸ� thread�� �ڵ����� ���� X)
 *  3.thread�� ������ main thread���� �Ѵ�.
 *  
 *  main thread�� �����ٰ� �ؼ� ���α׷� ����Ǵ� ���� �ƴϴ�.
 *  �� ���α׷��� �����ϴ� ��� thread�� ����Ǿ� �Ѵ�.
 *  
 *  Thread��ü�� �����ϴ� 2���� ���.
 *  
 *  1.Thread class�� ��� �޴´�.
 *  2.Runnable interface �����Ѵ�.
 *    -Runnable����� �����ϴ� ���� : � thread class�� �ٸ� class�� ��� �޾�����
 *     Thread class�� ��ӹ��� �� ����.(class�� ���߻�� X�̱� ����).
 *  
 */
class A {
	
	private int num;
	
	A(int num) {
		this.num = num;
	}
	
	void setNum(int num) {
		this.num = num;
	}
	
	int getNum() {
		return num;
	}
}

class ThreadB extends A implements Runnable {
	
	private int count;
	
	ThreadB(int num, int count) {
		super(num);
		this.count = count;
	}
	
	int getCount() {
		return count;
	}
	
	public void run() {
		for(int i = 0; i<getNum(); i++) {
			System.out.println((i+1) + " ");
			if(i == getNum() -1) {
				System.out.println("�������!!!!");
			}
			count++;
		}
	}
}

class ThreadA extends Thread {
	
	public void run() {
		for(int i = 0; i<10; i++) {
			System.out.print((i+1) + "����" + " ");
		}
	}
}

public class ThreadMain02 {

	public static void main(String[] args) {
		
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB(10, 5);
		Thread b2 = new Thread(b); //Runnable interface�� ������������ �̷��������.
		//Runnable interface���� run�޼ҵ尡 ����.
		
		//main thread//
		for(int i = 0; i<10; i++) {
			System.out.print(i + " ");
		}
		
		b2.start();
		a.start();
	}
}
