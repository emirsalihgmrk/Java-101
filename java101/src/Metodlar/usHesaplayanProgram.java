package Metodlar;

import java.util.Scanner;
public class usHesaplayanProgram {
    static void power(){
        Scanner inp=new Scanner(System.in);
        int base,exponent,result=1;
        System.out.print("Üslü sayının tabanını giriniz: ");
        base= inp.nextInt();
        System.out.print("Üslü sayının kuvvetini giriniz: ");
        exponent= inp.nextInt();
        for (int i=1;i<=exponent;i++){
            result *= base;
        }
        System.out.println(result);
        System.out.println("Devam etmek için 'y' işlemi bitirmek için 'n' harfini giriniz");

    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        String finish;
        while (true){
            power();
            finish=inp.nextLine();
            if (finish.equals("y")){
                power();
            }else if (finish.equals("n")){
                System.out.println("İşlem sona erdi.");
                break;
            }else {
                System.out.println("Hatalı bir ifade girdiniz lütfen tekrar deneyiniz");
            }
        }
    }
}
