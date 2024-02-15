class Test{
    static int id=100;
    public static void m1(){
        id=101;
        System.out.println(id);
    }
    public static void main(String[] args){
        m1();
    }
}