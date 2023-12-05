package Diziler;

import java.util.Arrays;
public class DizideTekrarEdenSayilar {
    public static void main(String[] args) {
        int[]arr={1,7,9,5,12,8,1,12,5,8,0,4,5};
        Arrays.sort(arr);
        for (int i=0;i<arr.length-1;i++){
            if ((i< arr.length-2)&&(arr[i]==arr[i+2])){
                continue;
            }
            if (arr[i]==arr[i+1]){
                System.out.println(arr[i]);
            }
        }
    }
}
