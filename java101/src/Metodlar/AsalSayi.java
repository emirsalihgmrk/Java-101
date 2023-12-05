package Metodlar;

import java.util.Scanner;
public class AsalSayi {
    static void number() {
        Scanner inp = new Scanner(System.in);
        int counter = 0;
        System.out.print("Bir sayı giriniz: ");
        int n = inp.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            System.out.println(n + " Bir asal sayıdır");
        } else {
            System.out.println(n + " Bir asal sayı değildir");
        }
        inp.nextLine();
        String finish;
        while (true) {
            System.out.println("İşleme devam etmek için 'y' bitirmek için ise 'n' harfini giriniz");
            finish = inp.nextLine();
            if (finish.equals("n")){
                System.out.println("İşlem sona ermiştir");
                break;
            }else if (finish.equals("y")) {
                number();
                break;
            }else {
                System.out.println("Hatalı bir ifade girdiniz lütfen tekrar deneyiniz");
            }
        }
    }
    public static void main(String[] args) {
        number();
    }
}
