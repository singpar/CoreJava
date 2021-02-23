import java.util.Locale;

public class ArrayManipulations {
    public static  void main(String args[]) throws Exception {
        int [] expectedArrayToSort = new int[] {6,4,1,9,0};
        int [] actualSortedArray=sortArray(expectedArrayToSort,"increasing");
        printArray(actualSortedArray);
        actualSortedArray=sortArray(expectedArrayToSort,"decreasing");
        printArray(actualSortedArray);
        actualSortedArray=sortArray(expectedArrayToSort,"h");

    }

    public static int [] sortArray(int [] arrayToSort,String order) throws Exception {
        boolean conditionToCheck;
        for(int i=0;i<arrayToSort.length;i++)
        {
            for(int j=i+1;j<arrayToSort.length;j++)
            {
                if(order.toLowerCase(Locale.ROOT).equals("increasing")) {
                    conditionToCheck = arrayToSort[i] > arrayToSort[j];
                }
                else if (order.toLowerCase(Locale.ROOT).equals("decreasing"))
                {
                    conditionToCheck = arrayToSort[i] < arrayToSort[j];
                }
                else
                    throw new Exception("Please pass the increasing or decreasing sort order value");
                if(conditionToCheck)
                {
                    int temp = arrayToSort[j];
                    arrayToSort[j]=arrayToSort[i];
                    arrayToSort[i]=temp;
                }
            }
        }


        return arrayToSort;
    }
    public static void printArray(int [] arrayToPrint)
    {
        for (int i=0;i<arrayToPrint.length;i++)
        {
            System.out.print(" "+arrayToPrint[i]);
        }
        System.out.println();
    }

}
