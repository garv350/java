class Phone{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void on(){
        System.out.println("Turning on phone");
    }
}
class Smartphone extends Phone{
    public void hello(){
        System.out.println("Hello");
    }
    public void on(){
        System.out.println("Turning on smartphone");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        // Phone p=new Phone(); //allowed
        // Smartphone sp=new Smartphone(); //allowed
        // p.greet();

        Phone obj=new Smartphone(); //yes it is allowed
        obj.greet(); // allowed
        obj.on(); // allowed due to overriding
        // obj.hello(); // not allowed
    }
}
