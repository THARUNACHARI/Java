class Test{
    static int a=100;// static
    int b=10;
    int c=20;
    public static void main(String[] args) {
        Test t1=new Test();
        System.out.println(t1.a+t1.b+t1.c);//130
        t1.c =30;
        System.out.println(t1.a+t1.b+t1.c);//140
        Test t2=new Test();
        System.out.println(t2.a+t2.b+t2.c);//130
        t2.a=101;
        t2.b=11;
        System.out.println(t2.a+t2.b+t2.c);//132
    }
}
    

