import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Collections_ArrayList {

    List<Integer> list=new ArrayList<>();
    public void input() {
        int x=1;
        for(int i=0; i<5; i++) {
            list.add(x);
            x*=10;
        }
          System.out.println(list);
//        list.add(500);
//        Time of adding and removing in O(n)
//        System.out.println(list);
//        list.remove(0);
//        System.out.println(list);
//        list.remove(Integer.valueOf(500));
//        System.out.println(list);
//        list.set(2,1000000);
//        System.out.println(list);
//        System.out.println(list.contains(400));
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//        for(Integer element:list)
//        {
//            System.out.println(element + "❤");
//        }

//        Iterator


//        Iterator<Integer> iterator=list.iterator();
//        while(iterator.hasNext())
//        {
//            System.out.println(iterator.next() + "❤❤❤");
//        }


    }
    public static void main(String[] args) {
        Collections_ArrayList obj=new Collections_ArrayList();
        obj.input();


    }


}
