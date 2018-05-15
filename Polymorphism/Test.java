public class Test {
	public static void main(String [] args) {
		Book book01 = new Book(
								"\"Lord of the Rings\" by Tolkien",
								"pretty profound",
								"enjoyable",
								500
							);
		
		Book book02 = new PhilosophyBook(
									"\"Critique of Pure Reason\" by Kant",
									"very profound", 
									"not enjoyable at all", 
									700,
									"very philosophically sophisticated"
									);
		book01.ripPage(50);
		
		book02.ripPage(50);
			
		System.out.println(book01.toString());
		System.out.println(book02.toString());		
	}
}
