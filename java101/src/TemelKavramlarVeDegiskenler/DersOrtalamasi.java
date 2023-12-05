package TemelKavramlarVeDegiskenler;
import java.util.Scanner;
public class DersOrtalamasi {
    public static void main(String[] args) {
        float a,b,c,d,e,f,g;
        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik Notu:");
        a=inp.nextFloat();
        System.out.print("Fizik Notu:");
        b= inp.nextFloat();
        System.out.print("Kimya Notu:");
        c= inp.nextFloat();
        System.out.print("Türkçe Notu:");
        d= inp.nextFloat();
        System.out.print("Tarih Notu:");
        e= inp.nextFloat();
        System.out.print("Müzik Notu");
        f= inp.nextFloat();
        g=(a+b+c+d+e+f)/6;
        String h =(g>=60)?"Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.println(g);
        System.out.println(h);

    }
}
