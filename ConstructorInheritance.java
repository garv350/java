class Base { // base class or parent class or super class
    public Base() {
        System.out.println("i am a base class constructor");
    }

    public Base(int a) {
        System.out.println("i am a base class overloaded constructor with value of a as: " + a);
    }
}

class Derived extends Base { // derived class or child class or sub class
    Derived() {
        super(0);
        System.out.println("i am a derived class constructor");
    }

    Derived(int a, int b) {
        super(a);
        System.out.println("i am a derived class overloaded constructor with value of b as: " + b);
    }
}

class Subderived extends Derived { // sub child class
    Subderived() {
        System.out.println("i am a child of derived constructor");
    }

    Subderived(int a, int b, int c) {
        super(a, b);
        System.out.println("i am a child of derived overloaded constructor with value of c as: " + c);
    }
}

public class ConstructorInheritance {
    public static void main(String[] args) {
        // Base b=new Base();
        // Derived d=new Derived();
        // Derived d = new Derived(14, 9);
        // Subderived s=new Subderived();
        Subderived s = new Subderived(10, 20, 30);
    }
}
