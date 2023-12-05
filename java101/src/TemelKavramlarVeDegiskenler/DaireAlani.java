package TemelKavramlarVeDegiskenler;
import java.util.Scanner;
public class DaireAlani {
    public static void main(String[] args) {
        double a,b,c;
        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin Yarıçapı:");
        a = inp.nextDouble();
        System.out.print("Daire Diliminin Açısı:");
        b = inp.nextDouble();
        c=(3.14*a*a*b)/360;
        System.out.print("Daire Diliminin Alanı:"+c);

    }
}
