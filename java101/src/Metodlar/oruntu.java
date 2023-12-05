package Metodlar;

import java.util.Scanner;
public class oruntu {
    static void pattern(){
        Scanner inp = new Scanner(System.in);
        int number;
        System.out.println("Örüntü kuralı:\nGirilen sayı  0 ve daha küçük olana kadar 5 eksiltilir,sonrasında tekrar eski değerine gelene kadar 5 eklenir.");
        System.out.print("Bir sayı giriniz: ");
        number=inp.nextInt();
        int number2=number+1;
        do {
            if (number>0){
                while(number>0){
                    System.out.println(number);
                    number -= 5;
                }
            }else{
                while (number<=number2){
                    System.out.println(number);
                    number += 5;
                }
            }
        }while (number<=number2);

        inp.nextLine();
        String finish;
        while (true) {
            System.out.println("İşleme devam etmek için 'y' bitirmek için ise 'n' harfini giriniz");
            finish = inp.nextLine();
            if (finish.equals("n")){
                System.out.println("İşlem sona ermiştir");
                break;
            }else if (finish.equals("y")) {
                pattern();
                break;
            }else {
                System.out.println("Hatalı bir ifade girdiniz lütfen tekrar deneyiniz");
            }
        }
    }
    public static void main(String[] args) {
        pattern();
    }
}
