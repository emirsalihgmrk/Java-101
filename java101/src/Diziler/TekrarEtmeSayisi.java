package Diziler;

import java.util.Arrays;
public class TekrarEtmeSayisi {
    public static void main(String[] args) {
        int[]arr={9,5,7,8,9,0,9,8,7,6,5,4,4,1,2,9,4,7};
        Arrays.sort(arr);
        int counter=2;
        for (int i=0;i< arr.length-1;i++){
            if ((i< arr.length-2)&&(arr[i]==arr[i+2])){
                counter++;
                continue;
            }
            if (arr[i]==arr[i+1]){
                System.out.println(arr[i]+" sayısı "+counter+" kere tekrar ediyor");
                counter=2;
            }
        }
    }
}
