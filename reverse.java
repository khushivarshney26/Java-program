import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        int n,r;
        System.out.println("enter the number:");
        Scanner k=new Scanner(System.in);
        n=k.nextInt();
        while(n>0){
            r=n%10;
            System.out.print(r);
            n=n/10; 
        }   
    }
}
