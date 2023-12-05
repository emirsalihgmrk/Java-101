package Donguler;
import java.util.Scanner;
public class AsalSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Bir sayı giriniz: ");
        number= input.nextInt();
        for ( int i=2;i<=number;i++){
            int k=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    k++;
                }
            }
            if (k<=2){
                System.out.println(i);
            }
        }
    }
}

