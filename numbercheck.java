import java.util.Scanner;
public class numbercheck {
     public static void main(String[] args) {
       int n;
       System.out.println("enter the value of n:");
       Scanner r=new Scanner(System.in);
       n=r.nextInt();
       if(n>0){
        System.out.println("Positive number");
       }
       else if(n<0){
        System.out.println("Negative number");
       }
       else{
        System.out.println("Zero");   
       }
    }
    
}
