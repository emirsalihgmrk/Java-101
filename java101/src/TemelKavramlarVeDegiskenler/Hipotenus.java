package TemelKavramlarVeDegiskenler;
import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args) {
        double a,b,c;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kenar 1:");
        a= inp.nextDouble();
        System.out.print("Kenar 2:");
        b= inp.nextDouble();
        c=Math.sqrt(a*a+b*b);
        System.out.print("Hipotenüs:"+c);
    }
}
