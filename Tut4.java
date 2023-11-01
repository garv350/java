public class Tut4 {
    public static void main(String[] args) {
        //INCREMENT AND DECREMENT OPERATOR
        int a=4;
        int b=4;
        // a++ first use then increment
        // ++a first increment then use
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++b);
        System.out.println(b);
        //encrypting the grade]
        char grade='B';
        grade=(char)(grade+8);//encrypting the grade
        System.out.println(grade);
        //decrypting the grade
        grade=(char)(grade-8);
        System.out.println(grade);
    }
}
