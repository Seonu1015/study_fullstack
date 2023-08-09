package hw_Free;

public class Book {

    private String title;
    private String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void bookInfo() {
        System.out.println("책 제목: " + title);
        System.out.println("작가: " + author);
    }
}
