class Employee{
    int id;
    String name;
    int salary;
    public void printdetails() {              // method
        System.out.println("my id is "+id);
        System.out.println("my name is "+name);
    }
    public int getsalary(){
        return salary;
    }
}

public class Oops {
    public static void main(String[] args) {
        // CLASS
        System.out.println("this is our custom class");
        // object creation
        Employee garv=new Employee();
        Employee john=new Employee();

        //setting attributes for garv
        garv.id=1;
        garv.name="Garv Singhal";
        garv.salary=100000;

        //setting attributes for john
        john.id=2;
        john.name="john Khandelwal";
        john.salary=100000;

        //calling methods for garv
        garv.printdetails();
        int sal=garv.getsalary();
        System.out.println("my salary is "+sal);
        
        //calling methods for john
        john.printdetails();
        int sal2=john.getsalary();
        System.out.println("my salary is "+sal2);

    }
}
