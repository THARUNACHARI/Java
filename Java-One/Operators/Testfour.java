class Test{
    public static void main(String[] args){

        int a=100;
        int b=200;
        int c=300;
        String ename="Rahul";
        System.out.println(a+b+c);       //600
        System.out.println(a+b+c+ename); //600Rahul
        System.out.println(a+ename+b+c); //100Rahul200300
    }
}