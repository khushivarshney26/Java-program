//7.Write a Java program to check whether a character is alphabet or not.
import java.util.Scanner;
public class char_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character: ");
        char a = sc.next().charAt(0);
        if((a >='A'&& a <='Z') || (a>='a' && a<='z')){
            System.out.println("Alphabet");
        }
        else{
            System.out.println("Anything else");
        }
    }
}
//Name-Khushi Varshney
//Sec-30
//Roll No-30
//University Roll No-2215000913