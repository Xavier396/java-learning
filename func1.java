class fc
{
    public static int plus3(int x) {//主函数，定义函数是平级的，主函数不可以包含定义函数
            return x+3;
        }
    public static void times3(int y){//没有具体返回值请使用void,此时可省略return语句
        System.out.println(y*3);
        }
    public static void main(String[] args) {
        int x,y;
        x=plus3(7827);
        System.out.println("x="+x);//函数的基础功能
    
}
}