package Diziler;

import java.util.Scanner;
public class DizidekiElemanlariSiralama {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.print("Dizideki eleman sayısını giriniz: ");
        int arrVal=inp.nextInt();
        int[]arr=new int[arrVal];
        int number;
        for (int i=0;i<arr.length;i++){
            System.out.print("Dizinin "+(i+1)+". elemanını giriniz: ");
            number=inp.nextInt();
            arr[i]=number;
        }
        for (int i=0;i<arr.length-1;i++){
            for (int j =0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.print("Dizinin küçükten büyüğe sıralanmış hali: ");
        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i]);
            if (i==arr.length-1){
                break;
            }
            System.out.print(",");
        }
    }
}
