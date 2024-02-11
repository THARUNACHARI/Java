import java.util.*;

class Test{
    
        public void m1(){
            System.out.println("Test class m1 method");
    }
    public static void main(String[] args){
        int a=100;
        Test t1= new Test();
       ArrayList ids=new ArrayList();
        t1.m1();
        System.out.println(ids.size());
        System.out.println(a);
    }
}