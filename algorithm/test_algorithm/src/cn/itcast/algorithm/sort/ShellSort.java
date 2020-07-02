package cn.itcast.algorithm.sort;

/**
 * 希尔排序
 */
public class ShellSort {
    public static void sort(int[] arr){
        //1.确定增长量h的值
        int h=1;
        while(h<arr.length/2){
            h=2*h+1;
        }

        while(h>=1){
            //2.找到分组
            for(int i=h;i<arr.length;i++){
                for(int j=i;j>=h;j-=h){
                    if(isBigger(arr[j-h],arr[j])){
                        exch(arr,j-h,j);
                    }else{
                        break;
                    }
                }
            }
            h=h/2;
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
