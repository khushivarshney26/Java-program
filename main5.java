/*5.wap to print the factorial of a no.*/
import java.util.Scanner;

public class main5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = input.nextInt();

    int factorial = 1;
    for (int i = 1; i <= n; i++) {
      factorial *= i;
    }

    System.out.println("Factorial of " + n + " is " + factorial);
  }
}
/* Name- khushi varshney
 * university roll no.-221500913
 * sec-G
 */