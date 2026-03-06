import java.util.Scanner;

public class OneHundredBottlesOfBeer {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int userInt = userInput.nextInt();

		for (int i = userInt; i > 0; i--) {
			verse(i);
		}
		userInput.close();
	}

	public static void verse(int count) {
		System.out.println(count + " bottles of beer on the wall");
		System.out.println(count + " bottles of beer");
		System.out.println("If one of those bottles should happen to fall");
		System.out.println((count - 1) + " bottles of beer on the wall\n");
	}
}
