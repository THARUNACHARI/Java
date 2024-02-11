class Test {
    static int a=100;
    int b=10;
    int c=20;

    public static void main(String[] args) {
        Test t1=new Test();
        t1.b=11;
        System.out.println(t1.a+t1.b+t1.c);//131
        Test t2=new Test();
        a=200;
        System.out.println(t2.a+t2.b+t2.c);//230
    }
}
