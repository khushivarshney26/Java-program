/*2. wap in java to print n to 1 natural nos by do while loop */
import java.util.Scanner;

public class main2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = input.nextInt();

    int i = n;
    do {
      System.out.print(i + " ");
      i--;
    } 
    while(i>=1);
  }
}
/* Name- Khushi Varshney
 * University roll no.-2215000913
 * Sec-G
 */
