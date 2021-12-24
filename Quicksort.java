public class Quicksort
{
  private int array[];
  private int length;
  private int swaps;
  private int comparisons;

  public Quicksort(int[] inputArr)
  {
    if (inputArr == null || inputArr.length == 0) 
    {
      return;
    }
    array = inputArr;
    length = inputArr.length;
    partition(0, length - 1);
  }

  public int[] partition(int lowerIndex, int higherIndex) 
  {
    int i = lowerIndex;
    int j = higherIndex;

    //Calculate pivot number, we are taking the pivot as the middle index number
    int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];

    //Divide into two arrays
    while (i <= j) 
    {
      
      /*
      * In each iteration, we will identify a number from left side which is greater then the pivot value, and we will also identify a number from right side which is less then the pivot value. Once the search is done, we exchange both numbers.
      */
      while (array[i] < pivot) 
      {
        i++;
        comparisons++;
      }
      while (array[j] > pivot) 
      {
        j--;
        comparisons++;
      }
      if (i <= j) 
      {
        swap(i, j);
        swaps++;
        //Moves index to next position on both sides
        i++;
        j--;
      }
      comparisons++;
    }
    //Calls partition() method recursively
    if (lowerIndex < j)
    {
      partition(lowerIndex, j);
    }
    if (i < higherIndex)
    {
      partition(i, higherIndex);
    }
    return array;
  }
 
  public void swap(int i, int j) 
  {
    int swapper = array[i];
    array[i] = array[j];
    array[j] = swapper;
  }

  public int getSwaps()
  {
    return swaps;
  }

  public int getComparisons()
  {
    return comparisons;
  } 
}