package Diziler;

import java.util.Arrays;
public class MaxMin {
    static void maxmin (int[]arr){
        Arrays.sort(arr);
        System.out.println("Dizinin en büyük elemanı: "+arr[arr.length-1]);
        System.out.println("Dizinin en küçük elemanı: "+arr[0]);
    }
    static void closest(int[]arr){
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr,5);
        System.out.println("5 elemanından küçük en büyük sayı: "+arr[index-1]);
        System.out.println("5 elemanından büyük en küçük sayı: "+arr[index+1]);
    }
    public static void main(String[] args) {
        int[]list={6,3,8,5,9,2};
        MaxMin.maxmin(list);
        MaxMin.closest(list);
    }
}
