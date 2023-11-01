import java.util.Random;
import java.util.Scanner;

public class Tut10 {
    public static void main(String[] args) {
        //RANDOM CLASS
        Random r=new Random();
        int a=r.nextInt(1,4);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1 for rock");
        System.out.println("enter 2 for paper");
        System.out.println("enter 3 for scissor");
        int b=sc.nextInt();
        System.out.println(a);
        if (a==b)
        System.out.println("match draw");
        else if(a==1&&b==2 || a==2&&b==3 || a==3&&b==1)
        System.out.println("user wins");
        else if(a==1&&b==3 || a==2&&b==1 || a==2&&b==1)
        System.out.println("computer wins");
        else
        System.out.println("you entered wrong number");
        System.out.println("thanks");
    }
}