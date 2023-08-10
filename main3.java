/*3.wap in java to print the table */
import java.util.Scanner;

public class main3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = input.nextInt();

    for (int i = 1; i <= 10; i++) {
      System.out.println(n + " x " + i + " = " + (n * i));
    }
  }
}
/* Name- Khushi Varshney
 * University roll no.-2215000913
 * Sec-G
 */
