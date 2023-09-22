//program to calculate power of a number
import java.util.Scanner;

public class power {
    public static void main(String[] args){
        int n,q,result=1;
        System.out.println("enter the numbers:");
        Scanner o=new Scanner(System.in);
        n=o.nextInt();
        System.out.println("enter the power:");
        q=o.nextInt();
        for(int i=1;i<=q;i++){
            result=n*result;
        }
            System.out.println(result);
    }
}
