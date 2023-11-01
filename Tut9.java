import java.util.Scanner;
public class Tut9 {
    public static void main(String[] args) {
        //SWITCH CASE STATEMENT
        Scanner sc=new Scanner(System.in);
        int a=10;
        int b=20;
        System.out.println("enter operator");
        String op=sc.nextLine();
        switch(op){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            case "%":
                System.out.println(a%b);
                break;
            default:
                System.out.println("wrong operator");
        }
    }
}