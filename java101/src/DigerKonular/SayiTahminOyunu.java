package DigerKonular;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class SayiTahminOyunu {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Random rand = new Random();
        int right=0;
        int number = rand.nextInt(100);
        int[] wrong=new int[5];
        System.out.println(number);
        while (right<5){
            System.out.print("1-100 arasında bir sayı giriniz: ");
            int select= inp.nextInt();
            wrong[right]=select;
            if (select==number){
                System.out.println("Tebrikler doğru tahmin ettiniz");
                break;
            }else {
                right++;
                System.out.println("Yanlış,kalan hakkınız:"+(5-right));
                if (select>number){
                    System.out.println("Girdiğiniz sayı,gizli sayıdan büyüktür");
                }
                if (select<number){
                    System.out.println("Girdiğiniz sayı,gizli sayıdan küçüktür");
                }
                if (right==5){
                    System.out.println("Haklarınız tükendi\nTahmin ettiğiniz sayılar: "+ Arrays.toString(wrong));
                    break;
                }
            }
        }
    }
}
