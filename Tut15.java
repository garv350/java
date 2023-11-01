import java.util.Scanner;
public class Tut15 {
    public static void main(String[] args) {
        //ARRAY
        int []marks=new int[5];
        marks[0]=100;
        marks[1]=1000;
        marks[2]=10000;
        marks[3]=100000;
        marks[4]=1000000;
        System.out.println(marks[2]);
        //DECLARATION AND MEMORY ALLOCATION OF ARRAY
        //1
        int []a;//declaration
        a=new int[5];//memory allocation
        //2
        int []b=new int[5];//declaration + memory allocation
        //3
        int []c={1,2,3,4,5};//declare + initialize
        //4
        Scanner sc=new Scanner(System.in);
        int []ab=new int[5];
        for(int i=0;i<5;i++){
            System.out.println("enter "+(i+1)+" element:");
            ab[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.println((i+1)+" element="+ab[i]);
        }
    }
}