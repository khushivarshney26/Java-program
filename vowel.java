//8.Write a Java program to input any alphabet and check whether it is vowel or consonant.
import java.util.Scanner;
public class vowel {
    public static void main(String[] args) {
        char ch;
        System.out.println("enter the character:");
        Scanner r=new Scanner(System.in);
        ch=r.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("vowels");
        }
        else{
            System.out.println("consonant");
        }
    }
}
//Name-Khushi Varshney
//Sec-30
//Roll No-30
//University Roll No-2215000913
