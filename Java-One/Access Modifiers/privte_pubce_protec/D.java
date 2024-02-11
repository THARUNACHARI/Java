package pack2;
import pack1.A;

class D extends A{  //using inheritance
    public static void main(String[] args){
        D obj=new D();
        obj.m1();
        obj.m4();
       // obj.m2(); using default  acees modifiernot poosible
        //obj.m3();//using  private aceesmodiferNot possible  inheritance
    }
}
