class shuzu {
    public static void main(String[] args) {
        int[] arr = new int[9];
        int i = 0;
        for (i = 0; i < 9; i++) {//����for(;;)ѭ������������������
            arr[i] = i;
            System.out.print(arr[i]);
            System.out.print(" ");
            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
        }
        System.out.println("���鳤�ȣ�"+arr.length);//arr.length����������ԣ�ָ�����Ԫ�ظ���
        System.out.println(arr);//����ӡ������洢�ĵ��ƣ������������
        for (i = 0; i < 9; i++) {
            int max =arr[0];
            if (max > arr[i])
                max = arr[i];
        }
        System.out.println(max);
    }
}