package Sorting;

public class CountingSort {
    public static void CountSort(int arr[]){
        int largest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            largest = Math.max(arr[i],largest);
        }
        
        int count[] = new int[largest+1];
        for (int i =0;i<arr.length;i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i = 0;i<count.length;i++){
            while (count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]= {2,3,1,4,1,1,3,4};
        CountSort(arr);
        printArr(arr);

    }
    
}
