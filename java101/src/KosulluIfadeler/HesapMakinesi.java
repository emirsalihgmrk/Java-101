package KosulluIfadeler;
import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        double a,b,select;
        System.out.print("1:Toplama\n2:Çıkarma\n3:çarpma\n4:bölme\nyapmak istediğiniz işlemi seçiniz:");
        select = inp.nextDouble();

        if ((select!=1)&&(select!=2)&&(select!=3)&&(select!=4)){
            System.out.println("Hatalı bir işlem yaptınız");
        }

        System.out.print("Birinci sayıyı giriniz:");
        a = inp.nextDouble();
        System.out.print("İkinci sayıyı giriniz:");
        b = inp.nextDouble();


        if (select == 1) {
            System.out.println(a + b);
        } else if (select == 2) {
            System.out.println(a - b);
        } else if (select == 3) {
            System.out.println(a * b);
        } else if (select==4) {
            if (b==0){
                System.out.println("Tanımsız");
            }else {
                System.out.println(a / b);
            }
        }
    }
}

