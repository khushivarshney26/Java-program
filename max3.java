import java.util.Scanner;
public class max3{
    public static void main(String[] args){
        int a,b,c;
        Scanner r=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        a=r.nextInt();
        System.out.println("Enter the value of b:");
        b=r.nextInt();
        System.out.println("Enter the value of c:");
        c=r.nextInt();
        if(a>b && a>c){
            System.out.println("a is maximum ");
        }
        else if(b>a && b>c){
            System.out.println("b is maximum ");
        }
        else{
            System.out.println("c is maximum " );
        }
    }
}

