package JAVA;
import java.util.Scanner;
public class num_inverse {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int p=1;
        while(n>0){
            int last=n%10;
            rev=rev+p*(int)Math.pow(10,last-1);
            n=n/10;
            p++;
        }
        System.out.print(rev);
    }
}

