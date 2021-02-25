import java.util.*;

public class StringManipulation {
    public static void main(String [] arg)
    {
        String inputStr = "abcd"; //output badc
        reverseFirstTwoCharAndSoOnInAString(inputStr);
        reverseFirstTwoCharAndSoOnInAString("wxyz");
        inputStr = "75hgf76dgh87"; //input
        //output = 7+5+7+6+8+7 = 40
        getNumbersFromStringAndAdd(inputStr);
        getConsecutiveNumberFromStringAndAdd(inputStr);
        HashMap<Character,Integer> mapWithOccurrenceOfEachChar=getOccurrenceOfEachCharInAString("pardeeeep siiingh");
        printCharWithHighestOccurrenceInMap(mapWithOccurrenceOfEachChar);
    }

    public static void reverseFirstTwoCharAndSoOnInAString(String myInputString) {
        String outStr="";
        for (int i=0;i<myInputString.length();i+=2)
        {
            outStr= outStr+ String.valueOf(myInputString.charAt(i+1))+String.valueOf(myInputString.charAt(i));
        }
        System.out.println("Output string is: "+outStr);
    }
    public static void getNumbersFromStringAndAdd(String myInputString){
        char [] ch = myInputString.toCharArray();
        int sum =0;
        for(int i=0;i<ch.length;i++)
        {
            char c = ch[i];
            if(Character.isDigit(c)) {
                System.out.println("Digit is: " + c);
                sum = sum + Character.getNumericValue(c);
            }
        }
        System.out.println("Sum of numbers extracted is: "+sum);
    }
    public static void getConsecutiveNumberFromStringAndAdd(String inputString){
        // atul34fg2
        char c [] = inputString.toCharArray();
        String myString ="";
        int sum=0;
        boolean isDigit= false;
        for(int i=0;i<inputString.length();i++)
        {
            if(Character.isDigit(c[i]))
            {
                myString = myString + c[i];
                isDigit=true;
            }
            else {
                if(isDigit)
                {
                    sum = sum + Integer.parseInt(myString);
                    myString="";
                    isDigit = false;
                }
            }
        }
        //condition to check for digits which are occuring at the end of the string,
        // in that case it will not got to else block of the code eg. string 124 , gh45gf5
        if(isDigit)
        {
            sum = sum + Integer.parseInt(myString);
        }
        System.out.println("Sum is: "+ sum);
    }
    public static HashMap<Character,Integer>  getOccurrenceOfEachCharInAString(String inputString) {
        HashMap<Character,Integer> myHashMap = new HashMap<Character,Integer>();
        for(int i=0;i<inputString.length();i++)
        {
            char [] chars = inputString.toCharArray();
            if(!myHashMap.containsKey(chars[i]))
            {
                myHashMap.put(chars[i],1);
                for(int j=i+1;j<inputString.length();j++)
                    if(chars[i]==chars[j])
                {
                    myHashMap.put(chars[i],myHashMap.get(chars[i])+1);
                }
            }
        }
        System.out.println("myHashMap is: "+myHashMap);
        TreeMap<Character,Integer> treeMap = new TreeMap<>(myHashMap);
        System.out.println("Sorted Map is: "+treeMap);
        return myHashMap;
    }
    public static void printCharWithHighestOccurrenceInMap(HashMap<Character,Integer> occurrenceMap) {
        int maxValue=0;
        Character key=' ';
        for(Map.Entry<Character,Integer> entry: occurrenceMap.entrySet())
        {
            if(maxValue<entry.getValue())
            {
                maxValue = entry.getValue();
                 key = entry.getKey();
            }
        }
        System.out.println("Key and value with max value are: Key is " +key +" and value is: "+ maxValue);
    }
}
