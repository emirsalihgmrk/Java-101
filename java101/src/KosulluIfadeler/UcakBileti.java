package KosulluIfadeler;
import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double a,b,c,d;
        System.out.print("Gidilecek mesafeyi giriniz(km):");
        a = inp.nextDouble();
        System.out.print("Yaşınızı giriniz:");
        b = inp.nextDouble();
        System.out.print("Yolculuk tipini seçiniz(tek yön-gidiş dönüş)\ntek yön için 1,gidiş dönüş için 2'yi tuşlayınız:");
        c = inp.nextDouble();
        d = a*0.1;
        if ((b<12)&&(c==1)){
            System.out.print("Bilet fiyatınız:"+d/2);
        }
        if ((b<12)&&(c==2)){
            System.out.print("Bilet fiyatınız:"+(2*((d/2)-(d/2/5))));
        }
        if ((b>=12)&&(b<24)&&(c==1)){
            System.out.print("Bilet fiyatınız:"+(d-d/10));
        }
        if ((b>=12)&&(b<24)&&(c==2)){
            System.out.print("Bilet fiyatınız:"+(2*((d-d/10)-((d-d/10)/5))));
        }
        if ((b>65)&&(c==1)){
            System.out.print("Bilet fiyatınız:"+(d-d*3/10));
        }
        if ((b>65)&&(c==2)){
            System.out.print("Bilet fiyatınız:"+(2*((d-d*3/10)-((d-d*3/10)/5))));
        }
        if ((b<0)||((c!=1)&&(c!=2))){
            System.out.print("Hatalı işlem yaptınız");
        }
    }
}
