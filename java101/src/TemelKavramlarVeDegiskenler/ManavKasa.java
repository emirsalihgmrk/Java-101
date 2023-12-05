package TemelKavramlarVeDegiskenler;
import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        double a,b,c,d,e,f;
        Scanner inp = new Scanner(System.in);
        System.out.print("Elma Kilosu:");
        a = inp.nextDouble();
        System.out.print("Armut Kilosu:");
        b = inp.nextDouble();
        System.out.print("Patlıcan Kilosu:");
        c = inp.nextDouble();
        System.out.print("Domates Kilosu:");
        d = inp.nextDouble();
        System.out.print("Muz Kilosu:");
        e = inp.nextDouble();
        f=a*3.67+b*2.14+c*5+d*1.11+e*0.95;
        System.out.print("Toplam Tutar:"+f);
    }
}
