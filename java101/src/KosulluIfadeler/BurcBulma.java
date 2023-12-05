package KosulluIfadeler;
import java.util.Scanner;
public class BurcBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a,b;
        System.out.print("Doğduğunuz ay(1-12):");
        a = inp.nextInt();
        System.out.print("Doğduğunuz gün:");
        b = inp.nextInt();
        if (((a==3)&&((b<=31)&&(b>=21)))||((a==4)&&((b>=1)&&(b<=20)))){
            System.out.print("Koç Burcu");
        }else if (((a==4)&&((b<=30)&&(b>=21)))||((a==5)&&((b>=1)&&(b<=21)))){
            System.out.print("Boğa Burcu");
        }else if (((a==5)&&((b<=31)&&(b>=22)))||((a==6)&&((b>=1)&&(b<=22)))){
            System.out.print("İkizler Burcu");
        }else if (((a==6)&&((b<=30)&&(b>=23)))||((a==7)&&((b>=1)&&(b<=22)))){
            System.out.print("Yengeç Burcu");
        }else if (((a==7)&&((b<=31)&&(b>=23)))||((a==8)&&((b>=1)&&(b<=22)))){
            System.out.print("Aslan Burcu");
        }else if (((a==8)&&((b<=31)&&(b>=23)))||((a==9)&&((b>=1)&&(b<=22)))){
            System.out.print("Başak Burcu");
        }else if (((a==9)&&((b<=30)&&(b>=23)))||((a==10)&&((b>=1)&&(b<=22)))){
            System.out.print("Terazi Burcu");
        }else if (((a==10)&&((b<=31)&&(b>=23)))||((a==11)&&((b>=1)&&(b<=21)))){
            System.out.print("Akrep Burcu");
        }else if (((a==11)&&((b<=30)&&(b>=22)))||((a==12)&&((b>=1)&&(b<=21)))){
            System.out.print("Yay Burcu");
        }else if (((a==12)&&((b<=31)&&(b>=22)))||((a==1)&&((b>=1)&&(b<=21)))){
            System.out.print("Oğlak Burcu");
        }else if (((a==1)&&((b<=31)&&(b>=22)))||((a==2)&&((b>=1)&&(b<=19)))){
            System.out.print("Kova Burcu");
        }else if (((a==2)&&((b<=28)&&(b>=20)))||((a==3)&&((b>=1)&&(b<=20)))){
            System.out.print("Balık Burcu");
        }
    }
}
