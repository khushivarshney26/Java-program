/*4.wap to reverse a number. */
import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
    System.out.println("Reversed Number: " + reversed);
    }
}
/* Name- khushi varshney
 * university roll no.-221500913
 * sec-G
 */