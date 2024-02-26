class DaoImpl implements DaoI{
    public void login(){
        System.out.println("DaoImpl class login method");
    }
    public void logout(){
        System.out.println("DaoImpl class logout method");
    }
    public boolean forgetpassword(){
        return true;
    }

    public static void main(String[] args){
         DaoImpl  obj=new DaoImpl();
         obj.login();
         obj.logout();
         boolean result=obj.forgetpassword();
         
         System.out.println(result);
    }
}
