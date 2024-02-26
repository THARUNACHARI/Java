class Test{
    int a=10;   //non-static means instance var
static int b=20;   //static variable


public static void main(String[] args){
  int c=30;     //local variable
  Test t1=new Test();
  
  System.out.println(t1.a);
}
}