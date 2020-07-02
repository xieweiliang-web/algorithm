package cn.itcast.algorithm.sort;

/**
 * 对传入的数组对象进行排序，对象是Comparable[]
 */
public class BubbleSort {
    public static void sort(Comparable[] data){
        boolean flag=true;
        for(int i=data.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(isBigger(data[j],data[j+1])){
                    exch(data,j,j+1);
                    flag=false;
                }
            }
            if(flag){
                break;
            }
        }
    }

    /**
     * 判断是否大于
     * @param a
     * @param b
     * @return
     */
        public static boolean isBigger(Comparable a,Comparable b){
            return a.compareTo(b)>0;
        }

        public static void exch(Comparable[] a,int i,int j){
            Comparable temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
}
