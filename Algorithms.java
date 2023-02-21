import java.util.List;

public class Algorithms {
    public int [] BubbleSort (int[] array)
    {
        boolean isNotEnd=true;
        while (isNotEnd==true)
        {
            isNotEnd=false;
            for (int i = 0; i < array.length-1; i++)
            {
                if (array[i] > array[i + 1])
                {
                    array = SwapElements(array, i);
                    isNotEnd=true;
                }
            }
        }
        return array;
    }
    private int[] SwapElements (int[] array, int index)
    {
        int temp=array[index];
        array[index]= array[index+1];
        array[index+1]=temp;
        return array;
    }
}
