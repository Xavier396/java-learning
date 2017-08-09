class prime{
    int number;
    String word1;
    {
        System.out.println("prime code testing......");
    }
   /* void setNum(int number){
        this.number=number;
        System.out.println(number);
    }*/
    void wrongExample(int number,String word1){
        number=number;
        word1=word1;
        System.out.println(number+word1);
    }
}
class use{
    public static void main(String[] args) {
        prime p=new prime();
        p.wrongExample(96,"yuhihgft");
        //p.setNum(96);
    }
}