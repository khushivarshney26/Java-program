package JAVA;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int rev=0;
        int rem;
        while(num>112210){
            rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
    System.out.println("reversed number:"+rev);
    }
}

