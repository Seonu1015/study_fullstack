package hw_Free;

public class Main {

	public static void main(String[] args) {
		
		Novel novel = new Novel("어린 왕자", "생텍쥐페리", "소설");
        ComicBook comicBook = new ComicBook("원피스", "오다 에이이치로", 100);

        novel.bookInfo();
        comicBook.bookInfo();
        
        System.out.println("-----------------------");
        
        novel.bookInfo(1943);
        comicBook.bookInfo(516600000);

	}
}
