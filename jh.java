class yihuo{
    private static void exchange(int a,int b) {
        if (a==b) 
            return;
        else
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+","+b);
        
    }
    public static void main(String[] args) {
        int a=99;
        int b=103;
        exchange(a,b);
    }
}