package Metodlar;

import java.util.Scanner;
public class palindromSayilar {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        long sayi,result=0,power = 1;
        int basamakSayisi,i;

        System.out.print("Bir sayı giriniz: ");
        sayi = inp.nextLong();
        long sayi2=sayi;

        for (i=0; sayi != 0; i++) {
            sayi /= 10;
        }

        basamakSayisi = i;

        for (int k = 1; k < basamakSayisi; k++) {
            power *= 10;
        }

        sayi=sayi2;

        while(sayi!=0){
            result+=(sayi%10)*power;
            power /= 10;
            sayi /= 10;
        }
        sayi=sayi2;
        if (result==sayi){
            System.out.println(sayi+" Bir palindrom sayıdır");
        }else {
            System.out.println(sayi+" Bir palindrom sayı değildir");
        }





    }
}
