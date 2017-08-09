/*static的特点：
1.随着类的加载而加载，随着类的消失而消失（生命周期最长）
2.优先于对象存在
3.被所有对象所共享
4.可以直接被类名所调用
*/ 
/*static注意事项
1.静态方法只能访问静态成员
    然而非静态方法可以访问静态和非静态的成员
2.静态方法中不能定义this.,super关键字
    因为静态优先于对象存在
3.主函数也是静态的
 */
class project{
     project()
     {
         System.out.println("project runing");
     }
     static int num=9;//静态成员变量，类变量
     String namae;//成员变量，实例变量
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