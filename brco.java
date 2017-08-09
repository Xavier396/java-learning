class bc
{
    public static void main(String[] args) {
        for (int x=0; x<3;x++) {
            System.out.println("x="+x);
        }
       System.out.println("-------------------------------------------------------------------");
        al:for (int y=0;y<3;y++){
            bl:for (int z=0;z<4;z++){
                System.out.println("y="+y+",z="+z);//标号决定退出的对象
                break al;
                    }
                }
        System.out.println("-------------------------------------------------------------------");
            for (int a=0;a<100;a++){
                if(a%2==1){
                    continue;}
            System.out.println("a="+a+"\t");//所有的偶数
                    }
         System.out.println("_________________________________________________________________________");
            al:for (int y=0;y<3;y++){
                bl:for (int z=0;z<4;z++){
                    System.out.println("y="+y+",z="+z);//标号决定退出的对象
                    continue al;
                    }
            }
        } 
     }