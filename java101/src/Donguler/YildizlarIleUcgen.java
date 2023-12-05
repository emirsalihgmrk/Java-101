package Donguler;
import java.util.Scanner;
public class YildizlarIleUcgen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a;
        System.out.print("Üçgenin basamak sayısı: ");
        a = inp.nextInt();
        for (int i=1;i<=a;i++){
            for (int b=1;b<=(a-i);b++){
                System.out.print(" ");
            }
            for (int c=1;c<=(2*i-1);c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
