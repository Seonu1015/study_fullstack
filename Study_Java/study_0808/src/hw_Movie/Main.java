package hw_Movie;

public class Main {
	public static void main(String[] args) {
		Movie movie = new Movie("기생충", 132);
		SFMovie sfMovie1 = new SFMovie("인터스텔라", 169);
		ComedyMovie comedyMovie1 = new ComedyMovie("써니", 124);
		
		SFMovie sfMovie2 = new SFMovie("아바타", 192);
		ComedyMovie comedyMovie2 = new ComedyMovie("극한직업", 111);
		
		movie.playMovie();
		movie.displayGenre();
		
		sfMovie1.playMovie();
		sfMovie1.displayGenre();
		sfMovie2.playMovie();
		sfMovie2.displayGenre();
		
		comedyMovie1.playMovie();
		comedyMovie1.displayGenre();
		comedyMovie2.playMovie();
		comedyMovie2.displayGenre();
	}
}
