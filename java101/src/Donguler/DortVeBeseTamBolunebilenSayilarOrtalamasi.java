package Donguler;
import java.util.Scanner;
public class DortVeBeseTamBolunebilenSayilarOrtalamasi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a;
        System.out.print("Bir sayı giriniz: ");
        a = inp.nextInt();
        int c = 0;
        int d = 0;
        for (int b=1;a>=b;b++){
            if((b%3==0)&&(b%4==0)){
                c += b;
                d++;
            }
        }
        System.out.print(c/d);
    }
}
