class mppx{
    private static void selectSort(int[] arr) {
        for (int x=0;x<arr.length-1;x++) {
            for(int y=x+1;y<arr.length;y++){
                if (arr[x]>arr[y]) {//从小到大“>”，从大到小“<”
                    int temp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] mp={74,1,5,7,2,10,8,6};
        printArray(mp);
        selectSort(mp);
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

}