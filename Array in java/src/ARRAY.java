public class ARRAY {
    public static void main(String args[]){
        System.out.println("hello");
        int[] arr;
        arr=new int[15];
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
      /*  for(long i:arr){
            System.out.println(i);// array print method 2

        }*/
// print multi dimensional  array as a function
        int[] [] array2={{1,2},{3,4},{5,6}};
        int[][] array3={{1,2},null,{5,6}};
        int[][]array4={{1,2},{4,5,6},{3}};

        System.out.println("\n"+array2.length);
        System.out.println("array 2");
        Demometrix.printmetrix(array2);
        System.out.println("array 3");
        Demometrix.printmetrix(array3);
        System.out.println("array 4");
        Demometrix.printmetrix(array4);
        System.out.println(".........................");
        Demometrix.searchindex(array2,0);


        //Add 45 at index 4 in arr
        System.out.println("------------------------------");
        Demometrix.Addelement(arr,4,45);

        System.out.println("------------------------------");
        Demometrix.deleteindex(arr,4);




    }
}
