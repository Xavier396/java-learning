/*static���ص㣺
1.������ļ��ض����أ����������ʧ����ʧ�������������
2.�����ڶ������
3.�����ж���������
4.����ֱ�ӱ�����������
*/ 
/*staticע������
1.��̬����ֻ�ܷ��ʾ�̬��Ա
    Ȼ���Ǿ�̬�������Է��ʾ�̬�ͷǾ�̬�ĳ�Ա
2.��̬�����в��ܶ���this.,super�ؼ���
    ��Ϊ��̬�����ڶ������
3.������Ҳ�Ǿ�̬��
 */
class project{
     project()
     {
         System.out.println("project runing");
     }
     static int num=9;//��̬��Ա�����������
     String namae;//��Ա������ʵ������
     void nameGiving(String name){
         namae=name;
     }
     void show(){
         System.out.println(namae+"xxx"+num);
     }
 }
    class bass{
        public static void main(String[] args) {
            project p0 =new project();
            p0.nameGiving("jolin");
            p0.show();
            project p1=new project();
            p1.nameGiving("kirakira");
            p1.show();
        }
    }