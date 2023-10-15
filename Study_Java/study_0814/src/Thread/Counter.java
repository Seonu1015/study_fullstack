package Thread;

public class Counter {
	
	private int count;
	
	public synchronized void increment() {
		count++;
	}
	
	public synchronized void decrement() {
		count--;
	}
	
	public void printCount() {
		System.out.println(count);
		synchronized (this) { // 싱크로나이즈드 블록화
			count*=2;
		}
	}
	
	public synchronized int getCount() {
		return count;
	}
}
