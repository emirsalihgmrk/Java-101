package Donguler;
import java.util.Scanner;
public class EnKucukVeEnBuyukSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,numberAmount;
        System.out.print("Gireceğiniz sayı miktarı: ");
        numberAmount = input.nextInt();
        System.out.print("1.sayıyı giriniz: ");
        number = input.nextInt();
        int numberMin=number;
        int numberMax=number;
        for (int i=2;i<=numberAmount;i++){
            System.out.print(i+".sayıyı giriniz: ");
            number = input.nextInt();
            if (number<=numberMin){
                numberMin=number;
            }
            if (number>=numberMax){
                numberMax=number;
            }
        }
        System.out.println("En küçük sayı: "+numberMin);
        System.out.print("En büyük sayı: "+numberMax);
    }
}
