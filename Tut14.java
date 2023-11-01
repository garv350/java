public class Tut14 {
    public static void main(String[] args) {
        //BREAK AND CONTINUE
        for(int i=0;i<50;i++){
            if(i%2==0){
                continue;
            }
            System.out.println(i);
            if(i==25){
                System.out.println("ending of loop");
                break;
            }
        }
    }
}