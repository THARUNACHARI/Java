package pack2;
import pack1.A;
//import pack1.B; class B is  default access

class C{
    public static void main(String[] args){
       A obj=new A();
       obj.m1();// public
       //obj.m2(); m2 is adefault same package run different package not run
       //obj.m3(); m3 is a private same package
       obj.m4();//outside package protected not run using inheritance we can run
    }
}