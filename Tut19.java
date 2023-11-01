public class Tut19 {
    static int add(int x,int y){
        int z=x+y;
        return z;
    }
    int sub(int x,int y){
        int z=x-y;
        return z;
    }
    public static void main(String[] args) {
        //METHODS IN JAVA
        int a=10;
        int b=20;
        int sum=add(a,b);
        System.out.println(sum);
        //method invocation using object creation
        Tut19 obj=new Tut19();
        int diff=obj.sub(a,b);
        System.out.println(diff);       
    }
}
