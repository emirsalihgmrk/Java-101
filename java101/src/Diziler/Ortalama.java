package Diziler;
import java.util.Scanner;
public class Ortalama {
    static void average(double[]arr){
        Scanner inp = new Scanner(System.in);
        double number;
        double result = 0;
        int counter = 1;
        for (double i : arr) {
            System.out.print("Dizinin "+(counter)+".elemanını giriniz:");
            number = inp.nextDouble();
            i = number;
            result += i;
            counter++;
        }
        System.out.println("Dizi elemanlarının ortalaması: "+result/ arr.length);
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Dizinizin eleman sayısını giriniz: ");
        int arrLength = inp.nextInt();
        double[]list=new double[arrLength];
        Ortalama.average(list);
    }
}



