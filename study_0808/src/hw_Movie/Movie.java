package hw_Movie;

public class Movie {
	
	String title;
	int duration;
	
	Movie(String title, int duration) {
		this.title = title;
		this.duration = duration;
	}
	
	void playMovie() {
		System.out.println("영화 \"" + title +"\"을 재생합니다. 총 " + duration+"분의 상영 시간입니다.");
	}
	
	static void displayGenre() {
		System.out.println("장르 : 알 수 없음.");
	}
}
