class Test {
    public void m1(){
        System.out.println("Test class m1 method");
    }
    public void m2(){//instance varaiables
        System.out.println("test class m2 method");

    }
    public  static void m3(){ //static varaiables
        System.out.println("test class m3 method");

    }
    public static void main(String[] args) {
        Test t1 = new Test(); //objects
        t1.m1();
        t1.m2();
        m3();
        Test.m3();
    }
}
