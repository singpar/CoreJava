import java.util.*;

public class MyList {
    public static void main(String [] args)
    {
        List<String> myArrayList = new ArrayList<String>();
        myArrayList.add("Pardeep");
        myArrayList.add("Sagar");
        myArrayList.add("Ajinkya");
        myArrayList.add("Pardeep");
        myArrayList.add(null);

        for (String list:myArrayList) {
            System.out.println("List item is:"+list);
        }
        linkedList();
    }
    public static void linkedList()
    {
        List<String> myLinkedList = new LinkedList<String>();
        myLinkedList.add("Pardeep");
        myLinkedList.add("Pardeep");
        myLinkedList.add(null);

        Iterator<String> iterator = myLinkedList.iterator();
        while (iterator.hasNext())
        {
            System.out.println("LinkedList value: "+iterator.next());
        }
        Collections.sort(myLinkedList);
        }
}
