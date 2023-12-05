package KosulluIfadeler;
import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a;
        System.out.print("Bir yıl giriniz:");
        a = inp.nextInt();
        if (((a%100)==0)&&((a%400)!=0)){
            System.out.print(a+" Bir artık yıl değildir");
        } else if ((a%4)==0) {
            System.out.print(a+" Bir artık yıldır");
        }
    }
}
