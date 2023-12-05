package TemelKavramlarVeDegiskenler;
import java.util.Scanner;
public class KDVtutari {
    public static void main(String[] args) {
        float a,b;
        Scanner inp = new Scanner(System.in);
        System.out.print("Ürünün KDV'siz Fiyatı:");
        a= inp.nextFloat();
        System.out.print("Ürünün KDV'li Fiyatı:");
        b= inp.nextFloat();
        float c = (b-a)*100/a;
        System.out.print("KDV oranı:%"+c);
    }
}
