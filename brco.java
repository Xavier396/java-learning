class bc
{
    public static void main(String[] args) {
        for (int x=0; x<3;x++) {
            System.out.println("x="+x);
        }
       System.out.println("-------------------------------------------------------------------");
        al:for (int y=0;y<3;y++){
            bl:for (int z=0;z<4;z++){
                System.out.println("y="+y+",z="+z);//��ž����˳��Ķ���
                break al;
                    }
                }
        System.out.println("-------------------------------------------------------------------");
            for (int a=0;a<100;a++){
                if(a%2==1){
                    continue;}
            System.out.println("a="+a+"\t");//���е�ż��
                    }
         System.out.println("_________________________________________________________________________");
            al:for (int y=0;y<3;y++){
                bl:for (int z=0;z<4;z++){
                    System.out.println("y="+y+",z="+z);//��ž����˳��Ķ���
                    continue al;
                    }
            }
        } 
     }