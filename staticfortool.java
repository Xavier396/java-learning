/**
 * ˵��������һ�����ڴ�������Ĺ�����
 * @author yhjzshhh
 * @version 1.0
*/
public class staticfortool {
/**
 * ˵�����������ڻ�ȡ����Ԫ�������ֵ�ĺ���
 * @param arr[]:����Ŀ������
 * @return arr[max]:���������е����Ԫ��
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
 * ˵�����������ڻ�ȡ����Ԫ������Сֵ�ĺ���
 * @param arr[]:����Ŀ������
 * @return arr[min]:���������е���СԪ��
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
 * ˵�����������ڶ��������ð������ĺ���
 * @param arr[]:����Ŀ������
 * 
 * 
 */


 public static  void bubbleSort(int [] arr){
        for(int x=0;x<arr.length-1;x++){
            for(int y=0;y<arr.length-x-1;y++){//ΪʲôҪ-x����ΪҪ��ÿ�αȽϵ�Ԫ���������١�ΪʲôҪ-1��Ϊ�˷�ֹ�Ǳ�Խ�硣
                if(arr[y]>arr[y+1]){//��С����>��,�Ӵ�С��<��
                    int temp=arr[y];
                    arr[y]=arr[y+1];
                    arr[y+1]=temp;
                }
            }
        }
    }
  
}