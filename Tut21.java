public class Tut21 {
    static int sum(int ...arr){
        //available as int []arr
        int result=0;
        for(int i:arr){
            result+=i;
        }
        return result;
    }
    public static void main(String[] args) {
        //VARIABLE ARGUMENTS (VarArgs)
        System.out.println("the sum of nothing is:"+sum());
        System.out.println("the sum of 5 is:"+sum(5));
        System.out.println("the sum of 4 and 5 is:"+sum(4,5));
        System.out.println("the sum of 3,4 and 5 is:"+sum(3,4,5));
        System.out.println("the sum of 2,3,4 and 5 is:"+sum(2,3,4,5));
        System.out.println("the sum of 1,2,3,4 and 5 is:"+sum(1,2,3,4,5));
    }
}
