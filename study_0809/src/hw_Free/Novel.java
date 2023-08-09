package hw_Free;

public class Novel extends Book {
	
    private String genre;

    public Novel(String title, String author, String genre) {
        super(title, author);
        this.genre = genre;
    }
    
    @Override
    public void bookInfo() {
    	super.bookInfo();
        System.out.println("장르: " + genre);
    }
    
    public void bookInfo(int publicationYear) {
    	super.bookInfo();
        System.out.println("장르: " + genre);
        System.out.println("출판 연도 : " + publicationYear + "년");
    }

}
