class Employee{
    int salary;
    String name;
    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name=n;
    }
}

class Cellphone{
    public void ring(){
        System.out.println("ringing...");
    }
    public void vibrate(){
        System.out.println("vibrating...");
    }
    public void call(){
        System.out.println("calling...");
    }
}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class Rectangle{
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}

class Tommy{
    public void hit(){
        System.out.println("hitting the enemy");
    }
    public void run(){
        System.out.println("running from the enemy");
    }
    public void fire(){
        System.out.println("firing on the enemy");
    }
}

public class Oopsques {
    public static void main(String[] args) {

        //problem 1
        // Employee garv=new Employee();
        // garv.setname("Garv");
        // System.out.println(garv.getname());
        // garv.salary=100000;
        // System.out.println(garv.getsalary());
        
        //problem 2
        // Cellphone vivov29=new Cellphone();
        // vivov29.call();
        // vivov29.vibrate();
        // vivov29.ring();

        // problem 3
        // Square sq=new Square();
        // sq.side=4;
        // System.out.println(sq.area());
        // System.out.println(sq.perimeter());

        // problem 4
        // Rectangle rect=new Rectangle();
        // rect.length=4;
        // rect.breadth=5;
        // System.out.println(rect.area());
        // System.out.println(rect.perimeter());

        // problem 5
        // Tommy player=new Tommy();
        // player.hit();
        // player.run();
        // player.fire();
    }
}
