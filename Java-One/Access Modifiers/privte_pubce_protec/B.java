package pack1;
class B{
    public void m5(){
        System.out.println("Pack1 - Class B(Default) - m5 method(public) ");
    }
    public static void main(String[] args){
           A obj=new A();
           obj.m1();//public
           obj.m2();//default
           //obj.m3(); m3 is private. with in the clas
           obj.m4();//protected
    }
}
