import java.util.Scanner;

public class PrintVowelsAndNonVowels {
  public static void main(String[] args) {
    int amountA = 0;
    int amountE = 0;
    int amountI = 0;
    int amountO = 0;
    int amountU = 0;
    int nonVowels = 0;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a string: ");
    String input = scanner.nextLine().toLowerCase();

    for(int i = 0; i < input.length(); i++) {

      char letter = Character.toLowerCase(input.charAt(i));

      switch (letter){
        case 'a':
          amountA++;
        case 'e':
          amountE++;
        case 'i':
          amountI++;
        case 'o':
          amountO++;
        case 'u':
          amountU++;
        default:
          nonVowels++;
      }
    }

    System.out.println("That string has " + amountA + " a's");
    System.out.println("That string has " + amountE + " e's");
    System.out.println("That string has " + amountI + " i's");
    System.out.println("That string has " + amountO + " o's");
    System.out.println("That string has " + amountU + " u's");
    System.out.println("That string has " + nonVowels + " non-vowels");

    scanner.close();
  }
}
