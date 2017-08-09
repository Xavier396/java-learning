class fc2
{
    public static int toget(int x,int y)
    {
        return x+y;
    }
    public static boolean comp(int a,int b)
    {
        //可采用if选择结构，三元运算符等
        //return (a==b)?true:false;
        return a==b;//这个最简单
 /*       
        if (a==b) {
            return true;
        }
        else
            return false;//else可以省略
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

    public static void main(String[] args) {//主函数的主要功能——调用函数
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
如何定义函数？
1.既然函数是一个独立的功能，那么该功能的运算结果是什么先明确。
2.再明确定义该功能的过程中是否需要未知的内容参与运算。
*/
