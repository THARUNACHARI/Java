class GP{
    public void m1(){
        System.out.println("GP class - m1 method");
    }
    public void m2(){
        System.out.println("GP class - m2 method");
    }
}
class Parent extends GP{
    public void m3(){
        System.out.println("Parent class - m3 method");
    }
}
class Child extends Parent{
    public void m4(){
        System.out.println("Child class - m4 method");
    }
}
class Test{
    public static void main(String[] args){
        Child c1=new Child();
        c1.m1();
        c1.m2();
        c1.m3();
        c1.m4();
    }
}
