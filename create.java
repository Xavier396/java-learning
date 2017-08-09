class information {
    private int age;
    private String name;

    {
        System.out.println("构造代码块运行中……");//为所有对象进行统一初始化
    }
    
    information() {
        System.out.println("Initialized!");
        System.out.println("someone A named " + name + " and " + age + " years old!");
    }

    information(String mingzi) {
        name = mingzi;
        System.out.println("someone B named " + name + " and " + age + " years old");
    }

    information(int nianling) {
        age = nianling;
        System.out.println("someone C named " + name + " and " + age + " years old!");
    }

    information(String xm, int nl) {
        name = xm;
        age = nl;
        System.out.println("someone D named " + name + " and " + age + " years old");
    }
}

class nametest {
    public static void main(String[] args) {
        information thePersonA=new information();
        information thePersonB=new information("gsigig");
        information thePersonC=new information(26);
        information thePersonD=new information("bsdbscjbjbf",12);
    }
}