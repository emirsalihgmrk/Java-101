package Donguler;
import java.util.Scanner;
public class UsluSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a,b,d=1,c;
        System.out.print("Üssü alınacak sayı: ");
        a = inp.nextInt();
        System.out.print("Üs olacak sayı: ");
        b = inp.nextInt();
        for (c=1;d<=b;d++){
            c *= a;
        }
        System.out.println(c);
    }
}
