public class Tut22 {
    static int factorial(int n){
        //factorial(n)=n*factorial(n-1)
        if(n==0||n==1)
        return 1;
        else
        return n*factorial(n-1);
    }
    static int fibonacci(int n){
        if(n<=1)
        return n;
        else
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        //RECURSION
        System.out.println("the value of factorial 5 is "+factorial(5));
        int n=10;
        System.out.println("fibonacci series upto "+n+" terms");
        for(int i=0;i<n;i++)
        System.out.print(fibonacci(i)+" ");
    }
}
