public class Main {
    public static void main(String[] args)
    {
       int[] array= new int[]{3,4,10,14,52,11,24,15,44,24};
       Algorithms algorithm = new Algorithms();
       array=algorithm.SelectionSort(array);
       for (int num : array)
       {
           System.out.print(num+",");
       }
    }
}