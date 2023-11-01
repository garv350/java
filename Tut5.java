import java.util.Scanner;
public class Tut5 {
    public static void main(String[] args) {
        //STRING
        // String name=new String("garv");
        String name="garv";
        System.out.print("the name is "+name);
        System.out.println("the name is "+name);
        System.out.printf("name is %s",name);
        System.out.format("name is %s",name);
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        System.out.println(st);
    }
}