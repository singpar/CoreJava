import java.util.*;

public class ConnectWise {

    public static void main(String [] args)
    {
        int [] myArray = new int [] {16,4,81,7,2};
       // sortArray(myArray);
        sortHashMapBasedOnKeys();
    }

    public static void sortArray(int [] array)
    {
        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i]>array[j])
                {
                    int temp = array[j];
                    array[j]= array[i];
                    array[i]= temp;
                }
            }
        }
        for(int k=0;k<array.length;k++)
        {
            System.out.print(" "+array[k]);
        }

    }
// hashmap add values and sort based on keys

    public static void sortHashMapBasedOnKeys()
    {
        HashMap<Integer,String> myHashMap = new HashMap<>();

        myHashMap.put(5,"Pardeep");
        myHashMap.put(2,"Sagar");
        myHashMap.put(8,"Ajinkya");

        TreeMap<Integer,String> sortedMap = new TreeMap<>(myHashMap);

        for(Map.Entry<Integer,String> entry: sortedMap.entrySet())
        {
            System.out.println("My Key is: "+entry.getKey());
            System.out.println("My Value is: "+entry.getValue());
        }
    }
}
