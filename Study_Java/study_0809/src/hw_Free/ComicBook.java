package hw_Free;

public class ComicBook extends Book {

	private int volume;

	public ComicBook(String title, String author, int volume) {
		super(title, author);
		this.volume = volume;
	}

	@Override
	public void bookInfo() {
		super.bookInfo();
		System.out.println("권수: " + volume);
	}

	public void bookInfo(int salesCount) {
		super.bookInfo();
		System.out.println("판매량: 약 " + (salesCount / 100000000) + "억 " + ((salesCount % 100000000) / 10000) + "만부");
	}

}
