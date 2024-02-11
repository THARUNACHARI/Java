class Test{
    public static void main(String[] arags){
        int[] eids = {201,202,203,204};
        String[] enames={"Rahul","Sonia","Priya","Modi","Rahul","Sonia","Priya","Modi"};
        //iterate using do{}while()

        int i=0;
        do{
            System.out.println(eids[i]);
            i++;
        }
        while(i<=eids.length-1);

        int a=0;
        do{
            System.out.println(enames[a]);
            a++;

        }while(i<=enames.length-1);
    }
}