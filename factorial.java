//program to find the factorial of a number
import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        int n,fact=1;
        System.out.println("enter the numbers:");
        Scanner x=new Scanner(System.in);
        n=x.nextInt();
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println("factorial is " + fact );
    }
}

