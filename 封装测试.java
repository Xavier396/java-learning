class Person {
    Person() {
            System.out.println("Intialized!");//���캯��
    }

    private int age = 19;

    void speak() {
        String lt = ("jidjifjidifgvif");
        System.out.println(lt);
    }

    public void setAge(int a) {
        if (a > 0 && a < 100)
            age = a;
        else
            System.out.println("���䲻����");
    }

    public int getAge() {
        return age;
    }

    String job = "Programmer";

    void told() {
        System.out.println("job��" + job);
    }

    void say() {
        System.out.println("age��" + age);
    }

}

class personal {
    public static void main(String[] args) {
        Person j = new Person();
        j.setAge(26);
        j.say();
        Person k=new Person();

    }
}