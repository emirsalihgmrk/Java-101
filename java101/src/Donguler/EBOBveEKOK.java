package Donguler;
import java.util.Scanner;
public class EBOBveEKOK {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi1,sayi2;
        System.out.print("Birinci sayı: ");
        sayi1 = inp.nextInt();
        System.out.print("İkinci sayı: ");
        sayi2 = inp.nextInt();
        int k = sayi1;
        while (k>=1){
            if ((sayi1%k==0)&&(sayi2%k==0)){
                System.out.println("EBOB: "+k);

                break;
            }
            --k;
        }
        k = sayi1;
        while (k<=(sayi1*sayi2)){
            if ((k%sayi1)==0 && (k%sayi2==0)){
                System.out.print("EKOK: "+k);

                break;
            }
            k++;
        }
    }
}
