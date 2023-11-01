public class Tut18 {
    public static void main(String[] args) {
        //ARRAY PROBLEMS
        int []a={10,20,30,40,50};
        int sum=0,num=20;
        for (int i : a) {
            sum=sum+i;
            if(num==i)
            System.out.println("present");
        }
        System.out.println(sum);
        float avg=sum/a.length;
        System.out.println(avg);
        //wap to add two matrices
        int [][]mat1={{1,2,3},{4,5,6}};
        int [][]mat2={{6,5,4},{3,2,1}};
        int [][]res=new int[2][3];
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                res[i][j]=mat1[i][j]+mat2[i][j];
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
        //wap to reverse an array
        int []arr={1,2,3,4,5,6};
        int l=arr.length;
        int n=Math.floorDiv(l,2);
        for(int i=0;i<n;i++){
            int temp=arr[i];
            arr[i]=arr[l-1-i];
            arr[l-1-i]=temp;
        }
        for (int element:arr) {
            System.out.print(element+" ");
        }
        //wap to find max and min in array
        int []x={1,2,3,4,5,6};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i : x) {
            if(i>max)
            max=i;
            if(i<min)
            min=i;
        }
        System.out.println(max);
        System.out.println(min);
        //wap to check array is sorted or not
        int []z={1,4,6,6,8,2,9};
        int f=0;
        for(int i=0;i<z.length-1;i++){
            if(z[i]>z[i+1]){
                System.out.println("array is unsorted");
                f=1;
                break;
            }
        }
        if(f==0)
        System.out.println("array is sorted");
        //wap to create an array
        
    }
}