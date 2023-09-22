//4.Write a  Java program to check whether a number is divisible by 5 and 11 or not.
import java.util.*;
public class divisible {
    public static void main(String[] args) {
        int n;
        System.out.println("enter the value of n:");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        if(n%5==0 && n%11==0){
         System.out.println("divisible by both 5 and 11");
        }
        else{
         System.out.println("not divisible by both 5 and 11");
        }
    }
}
//Name-Khushi Varshney
//Sec-30
//Roll No-30
//University Roll No-2215000913
