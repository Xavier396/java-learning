/**
 * 说明：这是一个用于处理数组的工具类
 * @author yhjzshhh
 * @version 1.0
*/
public class staticfortool {
/**
 * 说明：这是用于获取数组元素中最大值的函数
 * @param arr[]:这是目标数组
 * @return arr[max]:这是数组中的最大元素
 * 
 */
 public static int getMax(int[] arr) {
        int max = 0;
        for (int num = 1; num < arr.length; num++) {
            if (arr[num] > arr[max])
                max = num;
        }
        return arr[max];
    }
/**
 * 说明：这是用于获取数组元素中最小值的函数
 * @param arr[]:这是目标数组
 * @return arr[min]:这是数组中的最小元素
 * 
 */
 public static int getMin(int[] arr) {
        int min = 0;
        for (int num = 1; num < arr.length; num++) {
            if (arr[num] < arr[min])
                min = num;
        }
        return arr[min];
    }
/**
 * 说明：这是用于对数组进行冒泡排序的函数
 * @param arr[]:这是目标数组
 * 
 * 
 */


 public static  void bubbleSort(int [] arr){
        for(int x=0;x<arr.length-1;x++){
            for(int y=0;y<arr.length-x-1;y++){//为什么要-x，因为要让每次比较的元素数量减少。为什么要-1？为了防止角标越界。
                if(arr[y]>arr[y+1]){//从小到大“>”,从大到小“<”
                    int temp=arr[y];
                    arr[y]=arr[y+1];
                    arr[y+1]=temp;
                }
            }
        }
    }
  
}