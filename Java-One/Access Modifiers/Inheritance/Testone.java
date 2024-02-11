class Parent{
    public void m1(){
          System.out.println("Parent Class -  m1 method");
    }
    public void m2(){
          System.out.println("Parent Class -  m2 method");
    }
}
class Child extends Parent{
    public void m3(){
        System.out.println("Child Class -  m3 method");
    }
}
class TestOne{
    public static void main(String[] args){
       Child obj=new Child();
       obj.m1();
       obj.m2();
       obj.m3();
    }
}