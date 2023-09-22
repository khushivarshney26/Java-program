import java.util.Scanner;
public class leap {
    public static void main(String[] args) {
        int k;
        System.out.println("enter the year");
        Scanner r=new Scanner(System.in);
        k=r.nextInt();
        if(k%100==0 && k%400==0 || k%100!=0 && k%4==0){
            System.out.println("leap year");
        }
        else{
            System.out.println("not a leap year");
        }
     }
}
