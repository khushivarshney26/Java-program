/* 7.Write a program in java to print first and last digit of a number. */
import java.util.Scanner;

public class main7 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = input.nextInt();

    int lastDigit = n % 10;
    int firstDigit = n;
    while (firstDigit >= 10) {
      firstDigit /= 10;
    }

    System.out.println("First digit: " + firstDigit);
    System.out.println("Last digit: " + lastDigit);
  }
}
/* Name- Khushi Varshney
 * University roll no.-2215000913
 * Sec-G
 */
