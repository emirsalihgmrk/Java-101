package Donguler;
import java.util.Scanner;
public class DortVeBesinKuvvetleri {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a;
        System.out.print("Bir sayı giriniz: ");
        a = inp.nextInt();
        System.out.println("Dördün kuvvetleri");
        for (int b=1;a>=b;b*=4){
            System.out.println(b);
        }
        System.out.println("Beşin kuvvetleri");
        for (int b=1;a>=b;b*=5){
            System.out.println(b);
        }
    }
}
