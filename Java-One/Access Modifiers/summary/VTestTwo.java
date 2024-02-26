class Test{
    int a=10;   //non-static means instance var
    int b=20;   //non-static instance variable
    static int c = 30;

public static void main(String[] args){
 
  Test t1=new Test();
  System.out.println(t1.a + t1.b+c);//60
  System.out.println(t1.a + t1.b+Test.c);//60
  t1.b = 100;
  System.out.println(t1.a + t1.b);//110
  Test t2=new Test();
   System.out.println(t2.a + t2.b);//30
  
}
}
