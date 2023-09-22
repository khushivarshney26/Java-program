import java.util.Scanner;

public class sumofdigits {
     public static void main(String[] args) {
        int n,r,sum=0;
        System.out.println("enter the number:");
        Scanner k=new Scanner(System.in);
        n=k.nextInt();
        while(n>0){
            r=n%10;
            sum= sum+r;
            n=n/10;
        }
        System.out.println(sum);
    }
}
