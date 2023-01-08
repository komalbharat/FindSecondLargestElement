import java.util.*;
public class Array {
    public static void main(int arr[]){
        //int[] arr = new int[0];
        int n = arr.length;
        if(n<2){
            System.out.printf(" second largest number dose not exits ");
            return;
        }
        Arrays.sort(arr);
        int secondlargest = arr[n-2];
        System.out.printf(""+ secondlargest);
    }
}