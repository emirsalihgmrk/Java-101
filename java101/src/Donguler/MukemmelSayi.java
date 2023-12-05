package Donguler;
import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,result=0;
        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();
        int number2 = number;
        for (int i=1;i<number;i++){
            if (number2%i==0){
                result += i;
            }
        }
        if (result==number){
            System.out.print(number+" Bir mükemmel sayıdır.");
        }else{
            System.out.print(number+" Bir mükemmel sayı değildir.");
        }

    }
}

