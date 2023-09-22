import java.util.Scanner;
public class upperlowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character: ");
        char a = sc.next().charAt(0);
        if(a >='A'&& a <='Z'){
            System.out.println("Uppercase Alphabet");
        }
        else{
            System.out.println("Lowercase Alphabet");
        }
    }
}
