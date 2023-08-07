package study_0807;

public class Movie {

	private String title;
	public int time;

	private Movie(String title, int time) {
		this.title = title;
		this.time = time;
	}
	
	void playMovie() {
		System.out.println("영화 \"" + title + "\"을 재생합니다. 총 " + time + "분의 상영 시간입니다");
	}

	void displayGenre() {
		System.out.println("영화 장르 : 알 수 없음");
	}
	
}
