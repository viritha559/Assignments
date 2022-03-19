import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Tester {
    public static void main(String[] args){
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("india");
        arrayList.add("germany");
        arrayList.add("guyana");
        arrayList.add("brazil");
        arrayList.set(1,"sudan");
        arrayList.set(3,"egypt");
        arrayList.remove(2);
        List<String> list=arrayList.subList(0,arrayList.size() / 2);
        Iterator<String> itr=list.iterator();
        while(itr.hasNext()){
            int index = 1;
            itr.next();
            if(list.subList(0,arrayList.size() / 3).contains("_r%")&&(index>=0 && index<list.size()));{
            list.remove(index);
            index++;
        }
    
    }
    System.out.println(list);
    
}
}
