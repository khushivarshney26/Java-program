//11.Write a  Java program to input week number and print week day.
import java.util.Scanner;
public class week {
    public static void main(String[] args) {
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the week number:");
    n=sc.nextInt();
    if(n==1){
        System.out.println("Monday");
    }
    else if(n==2){
        System.out.println("Tuesday");
    }
    else if(n==3){
        System.out.println("Wednesday");
    }
    else if(n==4){
        System.out.println("Thursday");
    }
    else if(n==5){
        System.out.println("Friday");
    }
    else if(n==6){
        System.out.println("Saturday");
    }
    else if(n==7){
        System.out.println("Sunday");
    }
    else{
        System.out.println("invalid input");
    }
    }
}
//Name-Khushi Varshney
//Sec-30
//Roll No-30
//University Roll No-2215000913



