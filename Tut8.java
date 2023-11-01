public class Tut8 {
    public static void main(String[] args) {
        //LOGICAL OPERATOR
        boolean a=true;
        boolean b=false;
        //AND
        if(a&&b){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        //OR
        if(a||b){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        //NOT
        System.out.println("not of a is "+!a);
        System.out.println("not of b is "+!b);
    }
}
