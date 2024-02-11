class Test{
    static int a=100;
    int b=200;
    int c=300;
    public static void main(String[] args){
        Test t1=new Test();
        //System.out.println(b);
        System.out.println(a);//static
        System.out.println(t1.a);//object level non static
        System.out.println(Test.a);//class level
        Test t2=new Test();
    }

}
