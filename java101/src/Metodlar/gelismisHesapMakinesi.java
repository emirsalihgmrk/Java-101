package Metodlar;

import java.util.Scanner;
public class gelismisHesapMakinesi {
    static void plus(){
        Scanner inp=new Scanner(System.in);
        int number,result=0,i=1;
        System.out.println("İşlemi sonlandırmak için '0' sayısını giriniz");
        while (true){
            System.out.println(i++ +" .sayı:");
            number=inp.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç: "+result);
    }
    static void minus(){
        Scanner inp=new Scanner(System.in);
        int number,result=0,i=1;
        System.out.println("İşlemi sonlandırmak için '0' sayısının giriniz");
        while (true){
            System.out.println(i +" .sayı:");
            number=inp.nextInt();
            if (i==1){
                result += number;
                i ++;
                continue;
            }
            if (number==0){
                break;
            }
            result -= number;
            i ++;
        }
        System.out.println("Sonuç: "+result);
    }
    static void times(){
        Scanner inp=new Scanner(System.in);
        int number,result=1,i=1;
        System.out.println("İşlemi sonlandırmak için '1' sayısını giriniz");
        while (true){
            System.out.println(i +" .sayıyı giriniz:");
            number= inp.nextInt();
            if (number==0){
                result=0;
                break;
            }
            if ((i!=1)&&(number==1)){
                break;
            }
            result *= number;
            i++;
        }
        System.out.println("Sonuç: "+result);
    }
    static void divide(){
        Scanner inp=new Scanner(System.in);
        double number,result=0;
        int i=1;
        System.out.println("İşlemi sonlandırmak için '1' sayısını tuşlayınız");
        while (true){
            System.out.println(i +" .sayıyı giriniz");
            number= inp.nextDouble();
            if ((i!=1)&&(number==0)){
                System.out.println("Bir sayıyı '0' a bölemezsiniz");
                continue;
            }
            if (i==1){
                result += number;
                i++;
                continue;
            }
            if (number==1){
                break;
            }
            result /= number;
            i++;
        }
        System.out.println("Sonuç: "+result);

    }
    static void power(){
        Scanner inp=new Scanner(System.in);
        int base,exponent,result=1;
        System.out.println("İşlemi sonlandırmak için iki ifadinin yerinede '0' sayısını giriniz");
        System.out.println("Üslü sayının tabanını giriniz:");
        base = inp.nextInt();
        System.out.println("Üslü sayının kuvvetini giriniz:");
        exponent = inp.nextInt();
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println("Sonuç: "+result);
    }
    static void factoriel(){
        Scanner inp=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int number= inp.nextInt();
        int result=1;
        for (int i=1;i<=number;i++){
            result *= i;
        }
        System.out.println("Sonuç: "+result);
    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int select;
        String menu = """
                1-Toplama İşlemi
                2-Çıkarma İşemi
                3-Çarpma İşlemi
                4-Bölme İşlemi
                5-Üslü sayı hesaplama
                6-Faktöriyel Hesaplama
                """;

        do {
            System.out.println(menu);
            System.out.print("Yapmak istediğiniz işlemin numarasını seçiniz:");
            select=inp.nextInt();
            switch (select){
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factoriel();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Hatalı bir değer girdiniz tekrar deneyiniz");
            }
        }while (select!=0);


    }
}