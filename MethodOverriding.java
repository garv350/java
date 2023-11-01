class A{
    public int a;
    public int garv(){
        return 4;
    }
    public void method2(){
        System.out.println("method 2 of A class");
    }
}
class B extends A{
    @Override //override notation is recommended but not necessary
    public void method2(){
        System.out.println("method 2 of B class");
    }
    public void method3(){
        System.out.println("method 3 of B class");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        A a=new A();
        a.method2();
        B b=new B();
        b.method2();
    }
}
