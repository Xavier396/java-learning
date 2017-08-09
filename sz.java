class shuzu {
    public static void main(String[] args) {
        int[] arr = new int[9];
        int i = 0;
        for (i = 0; i < 9; i++) {//利用for(;;)循环语句来遍历这个数组
            arr[i] = i;
            System.out.print(arr[i]);
            System.out.print(" ");
            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
        }
        System.out.println("数组长度："+arr.length);//arr.length是数组的属性，指数组的元素个数
        System.out.println(arr);//这会打印出数组存储的抵制，不会输出数字
        for (i = 0; i < 9; i++) {
            int max =arr[0];
            if (max > arr[i])
                max = arr[i];
        }
        System.out.println(max);
    }
}