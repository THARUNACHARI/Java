import java.util.ArrayList;
import java.util.Iterator;
class Test{
    public static void main(String[] arags){

        int[] eids = {201,202,203,204};

        ArrayList ids=new ArrayList();
        ids.add(101);
        ids.add(102);
        ids.add(103);
        ids.add(104);
        
        
        System.out.println(eids);
        System.out.println(ids);

    
        Iterator itr=ids.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    
    }
}