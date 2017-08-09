import javax.net.ssl.ExtendedSSLSession;

class zh{
    private static void toHex(int num) {
        StringBuffer jolin=new StringBuffer();
        for(int x=0;x<8;x++){
            int temp=num &15;
            if (temp>9) 
                jolin.append((char)temp-10+'A');
            else
                jolin.append(temp);
                num=num>>>4;
        }
        System.out.println(jolin.reverse());
    }
    private static void toBin(int num) {
        StringBuffer sb=new StringBuffer();
        while (num>0) {
            sb.append(num%2);
            num=num/2;
        }
        System.out.println(sb.reverse());
    }
    public static void main(String[] args) {
        toBin(8);
        toHex(92);
    }
}