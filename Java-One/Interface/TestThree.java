abstract class Test{
    void m1(){ }  // concrete method
    abstract void m2();    //Non concreate method
}
class TestImpl extends Test{
    void m2(){}
}
class Demo{
 public static void main(String[] args){
     new TestImpl();
 }
}
