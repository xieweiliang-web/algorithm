package cn.itcast.algorithm.sort;

/**
 * 选择排序
 */
public class SelectionSort {
    public static void sort(int[] arr){
        for(int i=0;i< arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<=arr.length-1;j++){
                if(isBigger(arr[min],arr[j])){
                    min=j;
                }
            }
            exch(arr,i,min);
        }
    }

    public static void  exch(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static boolean isBigger(int a,int b){
        return a>b;
    }
}
