package Donguler;
import java.util.Scanner;
public class HarmonikSayilar {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a;
        double b=0;
        System.out.print("Bir sayı giriniz: ");
        a = inp.nextInt();
        for (double i=1;i<=a;i++){
            b += (1/i);
        }
        System.out.print(b);
    }
}
