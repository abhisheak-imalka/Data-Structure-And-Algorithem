import java.util.Scanner;

public class Main {
    public static void main(String args[]){
            //int Arr[]=new int[10];
           int Arr[]= new int[10];
            Arr[0]=10;
            Arr[1]=20;
            Arr[2]=40;
            Arr[3]=50;
            Arr[4]=60;
            Arr[5]=70;



            int Size= Arr.length;

            System.out.println(Size);
            Scanner userin=new Scanner(System.in);
            System.out.println(" Enter Index : ");
            int ind = userin.nextInt();

            System.out.println(" Enter Element : ");
            int ele = userin.nextInt();
            Size++;


            for(int k =7;k>ind;k-- ){
                Arr[k]=Arr[k-1];
            }
            Arr[ind]=ele;
            for(int j=0;j<Size;j++){
                System.out.print(Arr[j]+" ,");
            }

            System.out.println(" Delete Index : ");
            int deleteind = userin.nextInt();

            for(int k=7;deleteind<=k;k--){
                Arr[k-1]=Arr[k];
            }
            Size--;
            for(int l=0;l<6;l++){
                System.out.print(Arr[l]+" ,");
            }








    }



}
