import java.util.*;

public class Collection {
    public static void main(String[] args) {
        
        //jenrik kevay
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.clear();

        System.out.println(list);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
