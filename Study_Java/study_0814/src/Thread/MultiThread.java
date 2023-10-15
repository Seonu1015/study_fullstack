package Thread;

public class MultiThread extends Thread {
	private int id;
	
	public MultiThread(int id) {
		this.id = id;
	}
	
	@Override
	public void run() {
		for(int i=1; i<10; i++) {
			System.out.println("ID : " + id + " : " + i);
			
		}
		// 수업 내용 올려주면 추가
	}
}
