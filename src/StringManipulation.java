public class StringManipulation {
    public static void main(String [] arg)
    {
        String str = "abcd"; //output badc
        String outStr="";
        for (int i=0;i<str.length();i+=2)
        {
            outStr= outStr+ String.valueOf(str.charAt(i+1))+String.valueOf(str.charAt(i));
        }
        System.out.println("Output string is: "+outStr);
    }
}
