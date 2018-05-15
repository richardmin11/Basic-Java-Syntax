import java.util.Scanner;

public class BasicConditional {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your grade");
		String gradeAsString = input.nextLine();
		int grade = Integer.parseInt(gradeAsString);

		if (grade >= 80) {
			System.out.println("You got an A");
		} else if (grade >= 70) {
			System.out.println("You got a B");
		} else if (grade >= 60){
			System.out.println("You got a C");
		} else if (grade >= 50) {
			System.out.println("You got a D");
		} else {
			System.out.println("You failed, foo");
		}
	} 
}
