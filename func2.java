class fc2
{
    public static int toget(int x,int y)
    {
        return x+y;
    }
    public static boolean comp(int a,int b)
    {
        //�ɲ���ifѡ��ṹ����Ԫ�������
        //return (a==b)?true:false;
        return a==b;//������
 /*       
        if (a==b) {
            return true;
        }
        else
            return false;//else����ʡ��
*/
    }
    public static int bigger(int o,int j){
        return (o>j)?o:j;
    }
        public static void rect(int h,int l) {
        for (int g=0;g<h;g++) {
            for (int p=0 ;p<l;p++) {
                System.out.print("*");
            }
        System.out.println();
        }
    }

    public static void main(String[] args) {//����������Ҫ���ܡ������ú���
        int z=toget(9,4);
        System.out.println("z="+z);
        boolean k=comp(78,65);
        System.out.println("k="+k);
        int big=bigger(898,9898);
        System.out.println("big="+big);
        rect(5,8);
        

    }
}
/*
��ζ��庯����
1.��Ȼ������һ�������Ĺ��ܣ���ô�ù��ܵ���������ʲô����ȷ��
2.����ȷ����ù��ܵĹ������Ƿ���Ҫδ֪�����ݲ������㡣
*/
