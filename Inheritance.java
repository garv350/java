class Base{ //base class or parent class or super class
    int x;

    public int getx(){
        return x;
    }
    public void setx(int x){
        this.x=x;
    }
    public Base(){
        System.out.println("i am a base class constructor");
    }
}

class Derived extends Base{ //derived class or child class or sub class
    int y;

    Derived(){
        System.out.println("i am a derived class constructor");
    }

    public int gety(){
        return y;
    }
    public void sety(int y){
        this.y=y;
    }
}

public class Inheritance {
    public static void main(String[] args) {

        Base b=new Base();
        b.setx(4);
        System.out.println(b.getx());

        Derived d=new Derived();
        d.setx(44);
        System.out.println(d.getx());
        d.sety(5);
        System.out.println(d.gety());
    }
}
