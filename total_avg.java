//program to calculate total and average of 5 subjects;
import java.util.Scanner;

public class total_avg {
    public static void main(String[] args){
        int a,b,c,d,e,total;
        System.out.println("enter the numbers:");
        Scanner x=new Scanner(System.in);
        a=x.nextInt();
        b=x.nextInt();
        c=x.nextInt();
        d=x.nextInt();
        e=x.nextInt();
        total=a+b+c+d+e;
        double avg;
        avg=(a+b+c+d+e)/5;
        System.out.println("total marks of student " + total + " out of 500");
        System.out.println("avg marks of 5 subjects is "+ avg);

    }
}
