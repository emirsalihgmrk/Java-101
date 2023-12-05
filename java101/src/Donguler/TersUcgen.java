package Donguler;
import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        int basamak= input.nextInt();
        int basamak2=basamak;
        for (int i=1;i<=basamak;i++,basamak2--){
            for (int space=basamak;space>=basamak2;space--){
                System.out.print(" ");
            }
            for (int star=basamak2*2-1;star>=1;star--){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
