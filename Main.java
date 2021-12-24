import java.util.*;
public class Main 
{ 
  public static void main(String args[])
  {  
    int swap;
    int comparison;
    int input = 0;
    //850, 103, 582, 918, 238, 1259, 1178, 981, 276, 543
    //187, 398, 1000, 743, 632, 782, 1235
    int[] array = {850, 103, 532, 918, 238, 1259, 1148, 951, 216, 543, 127, 338, 1000, 743, 632, 742, 1235};

    Scanner user = new Scanner(System.in);
    System.out.println("\nWhat time would you like to be picked up? \nFor example if the time is 1:30 enter 130 without colon: ");
    input = user.nextInt();

    Quicksort sorter = new Quicksort(array);
    swap = sorter.getSwaps();
    comparison = sorter.getComparisons();

    System.out.println("\nThe next buses from Boston to New York will depart at:" );
    
    for(int i:array)
    {
      if ((i >= input) && (i % 100 == 0) && (i >=1000))
      {
        System.out.println("\n____________");
        System.out.print("| " + i/100 + ":00");
        System.out.print(" pm |\n");
        System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾");
      }
      else if ((i >= input) && (i % 10 == 0) && (i >=1000))
      {
        System.out.println("\n___________");
        System.out.print("| " + i/100 + ":" + i % 100);
        System.out.print(" pm |\n");
        System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾");
      }
      else if ((i >= input) && (i % 10 != 0) && (i >=1000))
      {
        System.out.println("\n____________");
        System.out.print("| " + i/100 + ":" + i % 100);
        System.out.print(" pm |\n");
        System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾");
      }
      else if ((i >= input) && (i % 100 == 0))
      {
        System.out.println("\n___________");
        System.out.print("| " + i/100 + ":00");
        System.out.print(" pm |\n");
        System.out.println("‾‾‾‾‾‾‾‾‾‾‾");
      }
      else if ((i >= input) && (i % 10 == 0))
      {
        System.out.println("\n___________");
        System.out.print("| " + i/100 + ":" + i % 100);
        System.out.print(" pm |\n");
        System.out.println("‾‾‾‾‾‾‾‾‾‾‾");
      }
      else if ((i >= input) && (i % 100 < 10))
      {
        System.out.println("\n___________");
        System.out.print("| " + i/100 + ":0" + i % 100);
        System.out.print(" pm |\n");
        System.out.println("‾‾‾‾‾‾‾‾‾‾‾");
      }
      else if ((i >= input) && (i % 10 != 0))
      {
        System.out.println("\n___________");
        System.out.print("| " + i/100 + ":" + i % 100);
        System.out.print(" pm |\n");
        System.out.println("‾‾‾‾‾‾‾‾‾‾‾");
      }
    }
    System.out.println("**Amount of swaps:** " + swap);
    System.out.println("**Amount of comparisons:** " + comparison);
  }
}