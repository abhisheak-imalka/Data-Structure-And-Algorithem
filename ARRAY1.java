public class ARRAY {
    public static void main(String args[]){
        System.out.println("hello");
        long[] arr;
        arr=new long[100];
        int nElement;
        int j;
        //.............................

        arr[0]=77;
        arr[1]=99;
        arr[2]=44;
        arr[3] =55;
        arr[4] =22;
        arr[5] =88;
        arr[6] =11;
        arr[7] =00;
        arr[8] =66;
        arr[9] =33;

        nElement=10;
        for(j=0;j<nElement;j++){
            System.out.print(arr[j]+" ");// array print method 1
        }
        for(long i:arr){
            System.out.println(i);// array print method 2

        }


    }
}

public class Demometrix {
    public static void printmetrix(int[][] m) {
        for (int i=0; i < m.length; i++){
            if( m[i]==null){
                System.out.println("(null)");
            }
            else{
                for(int j=0;j<m[i].length;j++){
                    System.out.print(m[i][j]+" ");
                }
            }
            System.out.println("");
        }

// how to call ?   Demometrix.printmetrix(array2);
/* array 2 is int [][] array2={{1,2},{3,4},{5,6}};
output come as:

array 2
1 2 
3 4 
5 6 

*/