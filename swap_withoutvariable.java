import java.util.Scanner;

public class swap_withoutvariable {
    public static void main(String[] args) {
        int a,b;
        Scanner r=new Scanner(System.in);
        System.out.println("enter the value of a:");
        a=r.nextInt();
        System.out.println("enter the value of b:");
        b=r.nextInt();
        System.out.println("before swapping "+a+""+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping "+a+""+b);
    }
}
