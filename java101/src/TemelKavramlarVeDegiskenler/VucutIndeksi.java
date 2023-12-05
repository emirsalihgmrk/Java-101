package TemelKavramlarVeDegiskenler;
import java.util.Scanner;
public class VucutIndeksi {
    public static void main(String[] args) {
        double a,b,c;
        Scanner inp = new Scanner(System.in);
        System.out.print("Boyunuzu Giriniz:");
        a = inp.nextDouble();
        System.out.println("Kilonuzu Giriniz:");
        b = inp.nextDouble();
        c=b/a*a;
        System.out.print("Vücut Kitle İndeksi:"+c);
    }
}
