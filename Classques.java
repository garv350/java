class Cylinder{
    private int radius;
    private int height;

    public Cylinder(){
        this.radius=4;
        this.height=5;
    }

    public Cylinder(int radius,int height){
        this.radius=radius;
        this.height=height;
    }

    // public void setRadius(int radius){
    //     this.radius=radius;
    // }
    // public int getRadius(){
    //     return radius;
    // }
    // public void setHeight(int height){
    //     this.height=height;
    // }
    // public int getHeight(){
    //     return height;
    // }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
    public double surfaceArea(){
        return 2*Math.PI*radius*height+2*Math.PI*radius*radius;
    }
    
}

public class Classques {
    public static void main(String[] args) {
        Cylinder cd=new Cylinder(9,12);
        // cd.setHeight(12);
        // cd.setRadius(9);
        System.out.println(cd.volume());
        System.out.println(cd.surfaceArea());
    }
}
