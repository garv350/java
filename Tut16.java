public class Tut16 {
    public static void main(String[] args) {
        //LENGTH OF ARRAY
        int []a={1,4,8,6,5};
        System.out.println(a.length);
        //DISPLAY ARRAY - SOUT
        float []marks={98.5f,99.5f,80.5f,79.5f};
        System.out.println(marks[2]);
        //-FOR LOOP
        String []name={"harry","rohan","garv","shubham"};
        for(int i=0;i<name.length;i++)
        System.out.println(name[i]);
        //-FOR EACH LOOP
        int []arr={45,78,24,56,98};
        for (int element: arr) {
            System.out.println(element);
        }
    }
}
