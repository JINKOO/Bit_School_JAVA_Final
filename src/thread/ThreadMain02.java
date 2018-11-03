package thread;
/*
 *  Thread class
 *   
 *  이전 까지는 모두 main Thread 하나 였다.
 *  지금 부터는 멀티 Thread기법.
 *  때로는 동시에 두 가지 이상의 일을 하는 프로그램이 필요하다.
 *  
 *  
 *  <Main thread>
 *  1.우리가 흔히 아는 main 메소드 이다.
 *  2.프로그램이 시작되면 자동으로 시작된다. (다른 thread는 자동으로 시작 X)
 *  3.thread의 생성은 main thread에서 한다.
 *  
 *  main thread가 끝났다고 해서 프로그램 종료되는 것이 아니다.
 *  그 프로그램을 구성하는 모든 thread가 종료되야 한다.
 *  
 *  Thread객체를 생성하는 2가지 방법.
 *  
 *  1.Thread class를 상속 받는다.
 *  2.Runnable interface 구현한다.
 *    -Runnable방식이 존재하는 이유 : 어떤 thread class가 다른 class를 상속 받았을때
 *     Thread class를 상속받을 수 없다.(class는 다중상속 X이기 때문).
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
				System.out.println("여기까지!!!!");
			}
			count++;
		}
	}
}

class ThreadA extends Thread {
	
	public void run() {
		for(int i = 0; i<10; i++) {
			System.out.print((i+1) + "실행" + " ");
		}
	}
}

public class ThreadMain02 {

	public static void main(String[] args) {
		
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB(10, 5);
		Thread b2 = new Thread(b); //Runnable interface를 구현했을때는 이런방식으로.
		//Runnable interface에는 run메소드가 없다.
		
		//main thread//
		for(int i = 0; i<10; i++) {
			System.out.print(i + " ");
		}
		
		b2.start();
		a.start();
	}
}
