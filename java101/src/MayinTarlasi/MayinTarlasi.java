package MayinTarlasi;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
public class MayinTarlasi {
    static void minefield(int row,int col){
        Scanner inp = new Scanner(System.in);
        Random rand = new Random();
        String[][]table=new String[row][col];
        String[][]temp=new String[row][col];
        for (String[] i : table) {
            Arrays.fill(i, "- ");
        }
        for (int i=0;i<(row*col/4);i++){
            int rowMine = rand.nextInt(row);
            int colMine = rand.nextInt(col);
            table[rowMine][colMine]="* ";
        }
        for (String[] i : temp) {
            Arrays.fill(i, "- ");
        }
        int counter = 0;
        int rowNum;
        int colNum = 0;
        do {
            for (String[] line:temp){
                for (String column:line){
                    System.out.print(column);
                }
                System.out.println();
            }
            System.out.print("Satır numarasını giriniz: ");
            rowNum = inp.nextInt();
            if ((rowNum<0)||(rowNum>row)){
                System.out.println("Geçerli bir sayı giriniz");
                continue;
            }
            System.out.print("Sütun numarasını giriniz: ");
            colNum = inp.nextInt();
            if ((colNum<0)||(colNum>col)){
                System.out.println("Geçerli bir sayı giriniz");
                continue;
            }
            if (Objects.equals(table[rowNum-1][colNum-1],"* ")){
                System.out.println("Mayına bastınız");
                for (String[] line:table){
                    for (String column:line){
                        System.out.print(column);
                    }
                    System.out.println();
                }
                System.out.println("Game Over");
                break;
            } else if ((rowNum-1!=0)&&(colNum-1!=0)&&(rowNum-1!=row-1)&&(colNum-1!=col-1)) {
                if (Objects.equals(table[rowNum - 2][colNum-1], "* ")){
                    counter++;
                }
                if (Objects.equals(table[rowNum][colNum-1], "* ")){
                    counter++;
                }
                if (Objects.equals(table[rowNum-1][colNum-2], "* ")){
                    counter++;
                }
                if (Objects.equals(table[rowNum-1][colNum], "* ")){
                    counter++;
                }
                if (Objects.equals(table[rowNum][colNum], "* ")){
                    counter++;
                }
                if (Objects.equals(table[rowNum-2][colNum-2], "* ")){
                    counter++;
                }
                if (Objects.equals(table[rowNum-2][colNum],"* ")){
                    counter++;
                }
                if (Objects.equals(table[rowNum][colNum-2],"* ")){
                    counter++;
                }
                temp[rowNum-1][colNum-1]=counter+" ";
                table[rowNum-1][colNum-1]=counter+" ";
            } else if ((rowNum-1==0)&&(colNum-1==0)) {
                if (Objects.equals(table[rowNum][colNum-1],"* ")){
                    counter++;
                }
                if (Objects.equals(table[rowNum-1][colNum],"* ")){
                    counter++;
                }
                if (Objects.equals(table[rowNum][colNum],"* ")){
                    counter++;
                }
                temp[rowNum-1][colNum-1]=counter+" ";
                table[rowNum-1][colNum-1]=counter+" ";
            } else if ((rowNum-1==row-1)&&(colNum-1==0)) {
                if (Objects.equals(table[rowNum-2][colNum-1],"* ")){
                    counter++;
                }
                if (Objects.equals(table[rowNum-2][colNum],"* ")){
                    counter++;
                }
                if (Objects.equals(table[rowNum-1][colNum],"* ")){
                    counter++;
                }
                temp[rowNum-1][colNum-1]=counter+" ";
                table[rowNum-1][colNum-1]=counter+" ";
            } else if ((rowNum-1==0)&&(colNum-1==col-1)) {
                if (Objects.equals(table[rowNum-1][colNum-2],"* ")){
                    counter++;
                }
                if (Objects.equals(table[rowNum][colNum-1],"* ")){
                    counter++;
                }
                if (Objects.equals(table[rowNum][colNum-2],"* ")){
                    counter++;
                }
                temp[rowNum-1][colNum-1]=counter+" ";
                table[rowNum-1][colNum-1]=counter+" ";
            } else if ((rowNum-1==row-1)&&(colNum-1==col-1)) {
                if (Objects.equals(table[rowNum-2][colNum-1],"* ")){
                    counter++;
                }
                if (Objects.equals(table[rowNum-1][colNum-2],"* ")){
                    counter++;
                }
                if (Objects.equals(table[rowNum-2][colNum-2],"* ")){
                    counter++;
                }
                temp[rowNum-1][colNum-1]=counter+" ";
                table[rowNum-1][colNum-1]=counter+" ";
            } else if (rowNum-1==0) {
                if (Objects.equals(table[rowNum-1][colNum-2],"* ")){
                    counter++;
                }
                if (Objects.equals(table[rowNum-1][colNum],"* ")){
                    counter++;
                }
                if (Objects.equals(table[rowNum][colNum-1],"* ")){
                    counter++;
                }
                if (Objects.equals(table[rowNum][colNum-2],"* ")){
                    counter++;
                }
                if (Objects.equals(table[rowNum][colNum],"* ")){
                    counter++;
                }
                temp[rowNum-1][colNum-1]=counter+" ";
                table[rowNum-1][colNum-1]=counter+" ";
            } else if (colNum-1==0) {
                if (Objects.equals(table[rowNum-2][colNum-1],"* ")){
                    counter++;
                }
                if (Objects.equals(table[rowNum][colNum-1],"* ")){
                    counter++;
                }
                if (Objects.equals(table[rowNum-1][colNum],"* ")){
                    counter++;
                }
                if (Objects.equals(table[rowNum-2][colNum],"* ")){
                    counter++;
                }
                if (Objects.equals(table[rowNum][colNum],"* ")){
                    counter++;
                }
                temp[rowNum-1][colNum-1]=counter+" ";
                table[rowNum-1][colNum-1]=counter+" ";
            } else if (rowNum-1==row-1) {
                if (Objects.equals(table[rowNum-1][colNum-2],"* ")){
                    counter++;
                }
                if (Objects.equals(table[rowNum-1][colNum],"* ")){
                    counter++;
                }
                if (Objects.equals(table[rowNum-2][colNum-1],"* ")){
                    counter++;
                }
                if (Objects.equals(table[rowNum-2][colNum-2],"* ")){
                    counter++;
                }
                if (Objects.equals(table[rowNum-2][colNum],"* ")){
                    counter++;
                }
                temp[rowNum-1][colNum-1]=counter+" ";
                table[rowNum-1][colNum-1]=counter+" ";
            } else if (colNum-1==col-1) {
                if (Objects.equals(table[rowNum-2][colNum-1],"* ")){
                    counter++;
                }
                if (Objects.equals(table[rowNum][colNum-1],"* ")){
                    counter++;
                }
                if (Objects.equals(table[rowNum-1][colNum-2],"* ")){
                    counter++;
                }
                if (Objects.equals(table[rowNum-2][colNum-2],"* ")){
                    counter++;
                }
                if (Objects.equals(table[rowNum][colNum-2],"* ")){
                    counter++;
                }
                temp[rowNum-1][colNum-1]=counter+" ";
                table[rowNum-1][colNum-1]=counter+" ";
            }else {
                System.out.println("Lütfen geçerli bir ifade giriniz");
            }
            boolean isThere = false;
            for (String[] strings : table) {
                for (String string : strings) {
                    if (string.equals("- ")) {
                        isThere = true;
                        break;
                    }
                }
            }
            if (!isThere){
                System.out.println();
                System.out.println("Tebrikler oyunu bitirdiniz");
                for (String[] line:table){
                    for (String column:line){
                        System.out.print(column);
                    }
                    System.out.println();
                }
                break;
            }
            counter=0;
            System.out.println("============================");
        }while (!Objects.equals(table[rowNum-1][colNum-1],"* "));
    }
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("Mayın tarlası oyununa hoşgeldiniz2");
        System.out.println("Oyunun boyutunu giriniz");
        System.out.print("Satır sayısı: ");
        int row = inp.nextInt();
        System.out.print("Sütun sayısı: ");
        int col = inp.nextInt();
        MayinTarlasi.minefield(row,col);
    }
}
