package Movie;

public class SFMovie extends Movie { // 장르소개
	
	String genre;
	
	SFMovie(String title, int time) {
		super(title, time);
	}
	
	@Override
	void displayGenre() {
		System.out.println("영화 장르 : SF");
	}
}
