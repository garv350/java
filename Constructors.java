class Employee {
    private int id;
    private String name;
    // constructor
    public Employee(){
        id=45;
        name="your name";
    }
    // constructor overloading
    public Employee(int myid,String myname){
        id=myid;
        name=myname;
    }

    public void setname(String n) {
        this.name = n;
    }

    public String getname() {
        return name;
    }

    public void setid(int i) {
        this.id = i;
    }

    public int getid() {
        return id;
    }
}

public class Constructors {
    public static void main(String[] args) {
        Employee garv = new Employee(45,"garv singhal");
        // garv.id = 1;
        // garv.name = "garv"; --> throws an error due to private access modifier
        // garv.setname("garv singhal");
        System.out.println(garv.getid());
        System.out.println(garv.getname());
    }
}
