abstract class Bank {
    public abstract void cal_Bal();
    
}
class Account extends Bank{
    public void cal_Bal(){
        System.out.println("Account class - cal_Bal method");

    }
    public static void main(String[] args){
        Account obj=new Account();
        obj.cal_Bal();
    }
}
