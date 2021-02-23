public class StringManipulation {
    public static void main(String [] arg)
    {
        String inputStr = "abcd"; //output badc
        reverseFirstTwoCharAndSoOnInAString(inputStr);
        reverseFirstTwoCharAndSoOnInAString("wxyz");
        inputStr = "75hgf76dgh87"; //input
        //output = 7+5+7+6+8+7 = 40
        getNumbersFromStringAndAdd(inputStr);
    }

    public static void reverseFirstTwoCharAndSoOnInAString(String myInputString)
    {
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
}
