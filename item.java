class Jolin
{
    String color ="blue";
    String name ="Jolin";
    void suck(){
        int x=1;
        System.out.println("�����ܱ�"+x+"��");
    }
    String favorite="�ڸɴ�";
}
class facetoitem
{
    public static void main(String[] args) {
        Jolin jolin=new Jolin();
        jolin.suck();
        jolin.favorite="����¡������ɫ��";
        System.out.println(jolin.favorite);
        new Jolin().suck();//��������
    }
}