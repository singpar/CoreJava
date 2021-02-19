import java.util.*;

public class LearnHashMap {

    HashMap<String,Integer> employeeRollNumbers;
    LearnHashMap()
    {
        System.out.println("This is my HashMap Class");
    }

    public void createHashMap()
    {
        employeeRollNumbers = new HashMap<>();
        employeeRollNumbers.put("Pardeep",9);
        employeeRollNumbers.put("Sagar",10);
        employeeRollNumbers.put("Ajinkya",1);
    }
    public void printHashMap()
    {
        System.out.println("Printing HashMap directly with Key Value: "+employeeRollNumbers);

        System.out.println("*************");
        System.out.println("Printing hashmap using Map.Entry");
        for(Map.Entry<String,Integer> entry: employeeRollNumbers.entrySet())
        {
            System.out.print("Key is: "+entry.getKey());
            System.out.println("And value is: "+entry.getValue());
        }
        System.out.println("Getting key of hashmap and Printing using Iterator");

        Set<String> employee= employeeRollNumbers.keySet();
        Iterator<String> iterator = employee.iterator();
        while (iterator.hasNext())
        {
            System.out.print(iterator.next() + "\t");
        }
        System.out.println();

        System.out.println("Getting values of hashmap and Printing using Iterator");

        Collection<Integer> rollNumber = employeeRollNumbers.values();
        Iterator<Integer> iterator1 = rollNumber.iterator();
        while (iterator1.hasNext())
        {
            System.out.print(iterator1.next() + "\t");
        }
        System.out.println();

    }
    public static void main(String args[])
    {
        LearnHashMap learnHashMap = new LearnHashMap();
        learnHashMap.createHashMap();
        learnHashMap.printHashMap();
    }
}