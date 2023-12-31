package hw_Movie;

public class SFMovie extends Movie{
	
	private static final String genre = "SF";
	
	SFMovie(String title, int duration) {
		super(title, duration);
	}
	
	@Override
	void playMovie() {
		System.out.println("영화 \"" + title +"\"을 재생합니다. 총 " + duration+"분의 상영 시간입니다.");
	}
	
	
	static final void displayGenre() {
        System.out.println("장르 : " + genre);
    }
}
