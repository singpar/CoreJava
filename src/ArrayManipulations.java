public class ArrayManipulations {
    public static  void main(String args[])
    {
        int [] expectedArrayToSort = new int[] {6,4,1,9,0};
        int [] actualSortedArray=sortArrayIncreasingOrder(expectedArrayToSort);
        printArray(actualSortedArray);

    }

    public static int [] sortArrayIncreasingOrder(int [] arrayToSort)
    {
        for(int i=0;i<arrayToSort.length;i++)
        {
            for(int j=i+1;j<arrayToSort.length;j++)
            {
                if(arrayToSort[i]>arrayToSort[j])
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
    }
}
