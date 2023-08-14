package Thread;

public class Class01 {
	public static void main(String[] args) {

		NewThread thread = new NewThread();
		//thread.run();
		thread.start(); // <- run 대신에 start 사용
		
		Student student = new Student();
		//student.start(); <- 인터페이스를 사용하고 있기 때문에 start를 쓸 수 없다
		Thread thread2 = new Thread(student); // 대신 쓰레드 클래스를 사용해서 start 작업을 진행
		thread2.start();
		
		System.err.println(); // 쉽게 볼 수 있는 쓰레드 예시
	}
}

//쓰레드 (Thread)
//프로그램의 작업 흐름

//멀티쓰레드 - 멀티쓰레딩(MultiThreading) : 쓰레드를 동시에 실행시킨다.

//쓰레드 사용방법
//1. Thread 클래스를 상속받아 사용하기
//2. Runnable 인터페이스를 상속받아 사용하기 - 인터페이스는 다중 상속이 가능해서 많이 쓰이는 편

//쓰레드의 문제점
//데이터 경쟁(race condition) -> 여러 개의 쓰레드가 동시에 공유된 데이터에 접근하여 발생할 수 있는 문제.

