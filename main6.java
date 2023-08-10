/*6.wap to check weather a no is pallendrom or no. */
import java.util.Scanner;

public class main6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = input.nextInt();

    int reversed = 0;
    int original = n;
    while (n != 0) {
      int digit = n % 10;
      reversed = reversed * 10 + digit;
      n /= 10;
    }

    if (original == reversed) {
      System.out.println(original + " is a palindrome number.");
    } else {
      System.out.println(original + " is not a palindrome number.");
    }
  }
}
/* Name- Khushi Varshney
 * University roll no.-2215000913
 * Sec-G
 */
