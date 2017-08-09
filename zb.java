class dee
{
    public static void main(String[] args) {
        for (int x=0 ;x<5;x++) {
            for (int y=0 ; y<=x;y++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    System.out.println("-----------------------------------------------------------------------");
        for(int x=1;x<=5;x++){
            for(int y=1;y<=x;y++)
            {
                System.out.print(y);
            }
        System.out.println();
     }
    System.out.println("-------------------------------------------------------------------------");
        for(int x=1;x<10;x++){
            for(int y=1;y<=x;y++)
            {
                System.out.print(y+"*"+x+"="+y*x+"\t");
            }
    System.out.println();
        }
    }
}