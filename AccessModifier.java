class Employee {
    private int id;
    private String name;

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

public class AccessModifier {
    public static void main(String[] args) {
        Employee garv = new Employee();
        // garv.id = 1;
        // garv.name = "garv"; --> throws an error due to private access modifier
        garv.setname("garv singhal");
        System.out.println(garv.getname());
    }
}
