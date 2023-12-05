package Donguler;
import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName,password;
        int select,balance=2000,price,remain=3;
        System.out.println("Bankamatiğe hoşgeldiniz lütfen kullanıcı adı ve şifrenizi giriniz");
        while (remain>0) {
            System.out.print("Kullanıcı Adı: ");
            userName = inp.nextLine();
            System.out.print("Şifre: ");
            password = inp.nextLine();
            --remain;
            if (userName.equals("Emir Salih") && (password.equals("123"))) {
                System.out.println("Sisteme giriş yaptınız");
                do {
                    System.out.println("1-Bakiye Sorgulama\n2-Para Yatırma\n3-Para çekme\n4-Çıkış Yapma");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = inp.nextInt();
                    if (select == 1) {
                        System.out.println("Bakiyeniz: "+balance);
                    } else if (select == 2) {
                        System.out.print("Para miktarını giriniz: ");
                        price = inp.nextInt();
                        balance += price;
                    } else if (select == 3) {
                        System.out.print("Para miktarını giriniz: ");
                        price = inp.nextInt();
                        if (balance<price){
                            System.out.println("Bakiyeniz yetersiz");
                        }else {
                            balance -= price;
                        }
                    } else if (select == 4) {
                        System.out.print("Çıkış yaptınız");
                    }else {
                        System.out.println("Hatalı bir sayı girdiniz");
                    }
                }while(select != 4);
                break;
            } else {
                if (remain==0) {
                    System.out.println("Hesabınız bloke olmuştur");
                }else {
                    System.out.println("Kalan Hakkınız: "+remain);
                }
            }
        }
    }
}
