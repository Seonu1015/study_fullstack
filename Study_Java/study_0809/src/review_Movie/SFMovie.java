package review_Movie;

public class SFMovie extends Movie{//행동: 장르 소개
	private static final String genre = "SF";
	SFMovie(String title, int duration) {
		super(title, duration);
	}
	
	static final void displayGenre() {
		System.out.println("장르 : " + genre);
	}
}
