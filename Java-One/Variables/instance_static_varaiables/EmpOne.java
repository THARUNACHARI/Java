class Emp{
     
    static String org_Name = "TCS";
    int eId;
    String eName;
    int eSal;
    
    public static void main(String[] args){
       Emp e1=new Emp();
       e1.eId =101;
       e1.eName = "Rahul";
       e1.eSal = 45000;

       Emp e2=new Emp();
       e2.eId = 102;
       e2.eName ="Sonia";
       e2.eSal = 55000;

       Emp e3=new Emp();
       e3.eId  = 103;
       e3.eName = "Priyanka";
       e3.eSal  = 65000;

       System.out.println(e1.eId);
       System.out.println(e1.eName);
       System.out.println(e1.eSal);
       System.out.println(e1.org_Name);
       System.out.println("*******");
       System.out.println(e2.eId);
       System.out.println(e2.eName);
       System.out.println(e2.eSal);
       System.out.println(e2.org_Name);
         System.out.println("*******");
       System.out.println(e3.eId);
       System.out.println(e3.eName);
       System.out.println(e3.eSal);
       System.out.println(e3.org_Name);
    }
}