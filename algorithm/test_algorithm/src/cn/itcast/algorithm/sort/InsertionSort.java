package cn.itcast.algorithm.sort;

public class InsertionSort {
    public static void sort(int[] arr){
        for(int i=0;i< arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(isBigger(arr[j-1],arr[j])){
                    exch(arr,j-1,j);
                }else{
                    break;
                }
            }
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
