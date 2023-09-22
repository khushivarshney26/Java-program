//12.Write a Java program to input month number and print number of days in that month.
import java.util.Scanner;

public class month {
    public static void main(String[] args) {
       int n;
       System.out.println("enter the code of day:");
       Scanner r=new Scanner(System.in);
        n=r.nextInt();
        if(n==1){
            System.out.println("jan=30 days");
        }
        else if(n==2){
            System.out.println("feb=28/29 days");
        }
        else if(n==3){
            System.out.println("march=31 days");
        }
        else if(n==4){
            System.out.println("april=30 days");
        }
        else if(n==5){
            System.out.println("may=30 days");
        }
        else if(n==6){
            System.out.println("jun=30 days");
        }
        else if(n==7){
            System.out.println("jul=31 days");
        }
        else if(n==8){
            System.out.println("aug=30 days");
        }
        else if(n==9){
            System.out.println("sep=30 days");
        }
        else if(n==10){
            System.out.println("oct=31 days");
        }
        else if(n==11){
            System.out.println("nov=30 days");
        }
        else if(n==12){
            System.out.println("dec=31 days");
        }
        else{
            System.out.println("invalid month number");
        }
    }
}
//Name-Khushi Varshney
//Sec-30
//Roll No-30
//University Roll No-2215000913


