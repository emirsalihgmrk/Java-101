package KosulluIfadeler;
import java.util.Scanner;
public class Kullanicigirisi {
    public static void main(String[] args) {
        String a,b,c,d;
        Scanner inp=new Scanner(System.in);
        System.out.print("Kullanıcı Adı:");
        a= inp.nextLine();
        System.out.print("Şifre:");
        b= inp.nextLine();
        if (a.equals("Emir Salih") && b.equals("6181")){
            System.out.print("Giriş Yaptınız");
        }else{
            System.out.print("bilgileriniz hatalı\nşifrenizi sıfırlamak istiyorsanız 1'i,tekrar denemek için 2'yi tuşlayınız:");
            c = inp.nextLine();
            if (c.equals("1")){
                System.out.print("Yeni şifreyi giriniz:");
                d= inp.nextLine();
                if (d.equals("6181")){
                    System.out.print("Yeni şifre eskisiyle aynı olamaz");
                }else{
                    System.out.print("Yeni şifre oluşturuldu");
                }
            }
            else{
                System.out.print("program bitti");
            }
        }
    }
}
