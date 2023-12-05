package Donguler;
import java.util.Scanner;
public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result=0,number,result2=1;
        System.out.print("Eleman sayısını giriniz: ");
        number= input.nextInt();
        for (int i=1;i<=number;i++){
            System.out.print(result+" ");
            int result3=result;
            result += result2;
            result2=result3;
        }
    }
}
