package TemelKavramlarVeDegiskenler;
import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        double a,b,c;
        Scanner inp = new Scanner(System.in);
        System.out.print("Katedilen Yol:");
        a=inp.nextDouble();
        b=a*2.2+10;
        c=(b<=20)?20:b;
        System.out.println("Taksimetre Tutarı:"+c);
    }
}
