class Jolin
{
    String color ="blue";
    String name ="Jolin";
    void suck(){
        int x=1;
        System.out.println("吸入淋逼"+x+"次");
    }
    String favorite="乌干达";
}
class facetoitem
{
    public static void main(String[] args) {
        Jolin jolin=new Jolin();
        jolin.suck();
        jolin.favorite="秦兴隆的亲妈色拉";
        System.out.println(jolin.favorite);
        new Jolin().suck();//匿名对象
    }
}