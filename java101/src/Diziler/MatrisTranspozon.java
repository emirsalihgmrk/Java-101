package Diziler;

public class MatrisTranspozon {
    public static void main(String[] args) {
        int[][]arr=new int[4][5];
        int number=0;
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                arr[i][j]=number;
                number++;
            }
        }
        System.out.println("Matris\n-----");
        for (int[] row :arr){
            for (int column:row){
                System.out.print(column+" ");
            }
            System.out.println();
        }
        System.out.println();
        int[][]list=new int[5][4];
        for (int i=0;i< list.length;i++){
            for (int j=0;j<list[i].length;j++){
                list[i][j]=arr[j][i];
            }
        }
        System.out.println("Transpozon\n----------");
        for (int[] row :list){
            for (int column:row){
                System.out.print(column+" ");
            }
            System.out.println();
        }

    }
}
