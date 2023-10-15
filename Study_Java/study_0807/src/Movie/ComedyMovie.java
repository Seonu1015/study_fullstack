package Movie;

public class ComedyMovie extends Movie { // 장르소개

	String genre;
	
	ComedyMovie(String title, int time) {
		super(title, time);
	}
	
	@Override
	void displayGenre() {
		System.out.println("영화 장르 : Comedy");
	}
	
}
