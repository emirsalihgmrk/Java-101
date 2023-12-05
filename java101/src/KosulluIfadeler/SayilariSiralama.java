package KosulluIfadeler;
import java.util.Scanner;
public class SayilariSiralama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a,b,c;
        System.out.print("Birinci sayıyı giriniz(a):");
        a = inp.nextInt();
        System.out.print("İkinci sayıyı giriniz(b)");
        b = inp.nextInt();
        System.out.print("Üçüncü sayıyı giriniz(c)");
        c = inp.nextInt();
        if ((a>b)&&(a>c)){
            if (b>c){
                System.out.print("a>b>c");
            }else {
                System.out.print("a>c>b");
            }
        } else if ((b>a)&&(b>c)) {
            if (a>c) {
                System.out.print("b>a>c");
            }else{
                System.out.print("b>c>a");
            }
        } else if ((c>a)&&(c>b)) {
            if (b>a){
                System.out.print("c>b>a");
            }else{
                System.out.print("c>a>b");
            }
        }
    }
}
