package mistra.com.util.sorting;

/**
 * Created by Mistra-WR on 2018/1/25/025.
 */

/**
 * 冒泡排序简单用法
 */
public class BubbleSorter2 {
    public  BubbleSorter2(){
        int a[]={49,38,65,97,76,13,27,49,78,34};
        int temp=0;
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }

    public static void main(String [] args){
        BubbleSorter2 bs =new BubbleSorter2();
    }
}
