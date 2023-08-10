/* 1.write a program in java to print 1 to n natural numbers by while loop */ 
import java.util.Scanner;

public class main1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = input.nextInt();

    int i = 1;
    while (i <= n) {
      System.out.print(i + " ");
      i++;
    }
  } 
}
/* Name- khushi varshney
 * university roll no.-221500913
 * sec-G
 */