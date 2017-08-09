class times{
    int time =9;
    void notSqure(int time){
        int result=this.time*time;
        System.out.println(result);
    }
    void badExample(int time){
        int result=time*time;
        System.out.println(result);
    }
}
class calc{
    public static void main(String[] args) {
        times test=new times();
        test.notSqure(2);
        test.badExample(2);
    }
    
}