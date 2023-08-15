import java.util.Iterator;
import java.util.LinkedList;

public class Josephus {

    public static void main(String args[]) {
        int n = 7;
        int k = 3;
        int result = josephusMethod(n,k);
        System.out.println(result);
    }

 static int josephusMethod(int n, int k){
    LinkedList<Integer> list = new LinkedList<>();
    for(int i = 0; i<n; i++){
        list.add(i);
    }
    Iterator <Integer> it = list.iterator();
    while(list.size()>1){
        int count = 0;
        while(count<k){
            while(it.hasNext() && count<k){
                it.next();
                count++;
            }
            if(count<k){
                it = list.iterator();
                it.next();
                count++;
            }
        } it.remove();
    }
    return list.getFirst();

}
    }
