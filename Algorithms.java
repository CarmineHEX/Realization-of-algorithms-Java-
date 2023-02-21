import java.util.List;

public class Algorithms {
    public int [] BubbleSort (int[] array)
    {
        boolean isNotEnd=true;
        int endSortnum=0;
        while (isNotEnd==true)
        {
            isNotEnd=false;
            for (int i = 0; i < array.length-1-endSortnum; i++)
            {
                if (array[i] > array[i + 1])
                {
                    array = SwapElements(array,i,i+1);
                    isNotEnd=true;
                }
            }
            endSortnum++;
        }
        return array;
    }
    public  int[] SelectionSort(int[] array)
    {
        int currentIndex=0;
       while(currentIndex!=array.length)
       {
            array=SwapElements(array,currentIndex,FindMinValueIndex(array, currentIndex));
            currentIndex++;
       }
        return array;
    }
    private int FindMinValueIndex(int[] array, int currentIndex)
    {
        int minValue=array[currentIndex];
        int minValueIndex=currentIndex;
        for(;currentIndex<array.length;currentIndex++)
        {
            if(array[currentIndex]<minValue)
            {
                minValue=array[currentIndex];
                minValueIndex=currentIndex;
            }
        }
        return minValueIndex;
    }
    private int[] SwapElements (int[] array, int firstIndex, int secondIndex)
    {
        int temp=array[firstIndex];
        array[firstIndex]= array[secondIndex];
        array[secondIndex]=temp;
        return array;
    }
}
