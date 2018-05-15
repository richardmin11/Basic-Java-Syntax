public class Book {
	public String bookName;
	public String profundity;
	public String enjoyability;
	public int numberOfPages;
	
	public Book(String bookName, String profundity, String enjoyability, int numberOfPages) {
		this.bookName = bookName;
		this.profundity = profundity;
		this.enjoyability = enjoyability;
		this.numberOfPages = numberOfPages;
	}
	
	public void ripPage(int page) {
		numberOfPages -= page;
	}
	
	public String toString() {
		return("The name of this book is " + bookName + "\n" +
				"This book is " + profundity + "\n" +
				"This book is "+ enjoyability + "\n" +
				"The length of this book is " + numberOfPages + " pages" + "\n");
	}

}
