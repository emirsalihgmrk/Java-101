package Diziler;

public class Bharfi {
    public static void main(String[] args) {
        String[][]stars=new String[11][11];
        for (int i=0;i< stars.length;i++){
            for (int j=0;j<stars[i].length;j++){
                if ((i==0)||(i==1)||(i==5)||(i==9)||(i==10)){
                    stars[i][j]="*";
                } else if (j == 0 || j == 1 || j == 9 || j == 10) {
                    stars[i][j]="*";
                } else if (((i==4)&(j==8)||(i==6)&&(j==8))) {
                    stars[i][j]="*";
                } else {
                    stars[i][j]=" ";
                }
            }
        }
        for (String[] row : stars) {
            for (String column : row) {
                System.out.print(column);
            }
            System.out.println();
        }
    }
}

