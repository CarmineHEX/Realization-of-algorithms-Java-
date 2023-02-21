public class Main {
    public static void main(String[] args)
    {
       int[] array1= new int[]{3,4,10,14,52,11,24,15,44,24};
       Algorithms algorithm = new Algorithms();
       array1=algorithm.BubbleSort(array1);
       for (int num : array1)
       {
           System.out.print(num+",");
       }
    }
}