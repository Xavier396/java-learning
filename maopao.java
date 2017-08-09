class maopao{
    public static void main(String[] args) {
        int [] mp={74,1,5,7,2,10,8,6};
        printArray(mp);
        bubbleSort(mp);
        printArray(mp);
        
    }
    public static void printArray(int []arr) {
        System.out.print("数组：[");
        for(int j=0;j<arr.length;j++){
            if(j!=arr.length-1)
            System.out.print(arr[j]+",");
            else
            System.out.println(arr[j]+"]");
        } 
    }
    private static void bubbleSort(int [] arr){
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