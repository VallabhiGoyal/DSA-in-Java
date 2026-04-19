package Sorting;

public class QuickSort {
    public static void main(String[] args){
        int[] arr = {6, 3, 9, 5, 2, 8};

        quick(arr, 0, arr.length - 1);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];

        int i = low -1;
        for(int j = low; j<high; j++){
            if(arr[j] < pivot){
                i++;

                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

    public static void quick(int[] arr, int low, int high){
        if(low < high){
            int pIdx = partition(arr, low, high);
            quick(arr, low, pIdx-1);
            quick(arr, pIdx+1, high);
        }
    }
}