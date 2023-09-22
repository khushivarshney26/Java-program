import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        int a,b,temp;
        Scanner r=new Scanner(System.in);
        System.out.println("enter the value of a:");
        a=r.nextInt();
        System.out.println("enter the value of b:");
        b=r.nextInt();
        System.out.println("before swapping "+a+""+b);

        temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping "+a+""+b);
    }
}
