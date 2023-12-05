package KosulluIfadeler;
import java.util.Scanner;
public class EtkinlikOnerme {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int a;
        System.out.println("Hava sıcaklığına göre aktivite önerme");
        System.out.print("Hava sıcaklığını giriniz:");
        a = inp.nextInt();
        if (a<5){
            System.out.print("Kayak yapabilirsiniz");
        } else if ((5<a)&&(a<=15)) {
            System.out.print("Sinemaya gidebilirsiniz");
        } else if ((15<a)&&(a<=25)) {
            System.out.print("Piknik yapabilirsiniz");
        } else if (a>25) {
            System.out.print("Yüzebilirsiniz");
        }
    }

}
