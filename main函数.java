/*
主函数是程序入口，可以被jvm调用

主函数定义
    public static void main(String[] args)
        public：代表最大的访问权限
        static：静态函数（函数随着类的加载而加载）
        void:主函数没有具体的返回值类型
        main:作为函数名被jvm所调用，虽然他并不是关键字
        (String[] args):函数的参数，类型是数组，内容是字符串，args是参数的变量名，args=arguments，args可以替换成别的内容

主函数是固定格式的：jvm识别




*/
class mains{
    public static void main(String[] args) {
        System.out.println(args);
        System.out.println(args.length);
    }
}