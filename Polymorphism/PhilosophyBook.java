public class PhilosophyBook extends Book {
	public String philophicalSophistication;
	
	public PhilosophyBook(
						String bookName,
						String profundity, 
						String enjoyability,
						int numberOfPages,
						String philophicalSophistication
						)
	{
		super(bookName, profundity, enjoyability, numberOfPages);
		this.philophicalSophistication = philophicalSophistication;
	}
	
	@Override
	public String toString() {
		return(super.toString() + "This book is " + philophicalSophistication);
	}

}
