package mistra.com.util.sorting;

/**
 * Created by Mistra-WR on 2018/1/25/025.
 */

/**
 * 冒泡排序测试
 */
public class Test {
    public static void main(String [] args){
        int [] a ={1,56,48,889,75,356,2};
        int temp = 0;
        for(int i=0;i<a.length-1;i++){
            for (int j=0;j<a.length-1-i;j++){
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
}
