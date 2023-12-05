package Donguler;
import java.util.Scanner;
public class Faktoriyel {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a,b,c=1,e,f,d=1,g=1;
        System.out.print("Birinci sayıyı giriniz: ");
        a = inp.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        b = inp.nextInt();
        f=a-b;
        for (int i=1;i<=a;i++){
            c *= i;
        }
        for (int i=1;i<=b;i++){
            d *= i;
        }
        for (int i=1;i<=f;i++){
            g *= i;
        }
        e = c/(d*g);
        System.out.println(e);
    }
}
