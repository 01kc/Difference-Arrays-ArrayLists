import java.util.ArrayList;

public class DifferenceArraysArrayLists
{
    public static void main(String[] args)
    {
        // creating an Array - doesn't require an import statement unlike array lists
       
        int[] numbers = { 1, 2, 3 }; // method 1: declare & initialize in same step
                                     // doesn't require a size or the keyword 'new'
        // int[] numbers2 = new int[5]; 
        // method 2: declare then intialize values later: dynamically created, requires 'new' & size
        // int[] numbers3 = new int[MAX_SIZE];
        // method 3: uses a size variable (requires a guess) if size is unknown, 
        // may result in partially filled array
       
        // creating an Array List:
        // ArrayList<int> error = new ArrayList<int>(); 
        // uncommenting results in compile-time error due to primitive type, requires generic type object

        ArrayList<Integer> aList = new ArrayList<Integer>(); 
        // proper method to create array list uses object Type and 'new' with constructor
        // deosn't require intial capacity but you can supply if known

        // Changing the values of the elements in arrays:
        // Arrays require assignment statements to supply initial values or replace old ones
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        // since size is fixed, can't insert, remove, or add elements

        // accessing the elements & finding the size
        System.out.println("Array elements: ");
        for (int n : numbers)
        {
            System.out.println(n); // prints the array
        }
        System.out.println("Size of array: " + numbers.length); // name.length without parentheses
        
        // error examples:
        System.out.println("numbers[3] = 40; would render out of bounds exception - can't change the size");
        System.out.println("numbers[2] = 30.0; would also result in error, arrays have type-safety, all elements must have same type");

        System.out.println(); // blank line

        // dynamic sizing of array lists
        // manipulating array lists is much simpler with all the built-in operations & size flexibility
        aList.add(5);
        aList.add(10);
        aList.add(20);
        aList.add(2, 15);
        aList.add(30);
        aList.set(4, 25); // change 30 to 40 at index 4

        System.out.println("Array List elements: ");
        for (int i : aList)
        {
            System.out.println(i); // prints the array list
        }
        // accessing the size of array lists
        System.out.println("Size of array list: " + aList.size()); 
        // use the size method, include parentheses

        System.out.println(); // blank
        System.out.println("One aspect arrays have that array lists don't- ");
        System.out.println("Multidimensional Arrays, Example: ");
        
        int[][] values = 
        {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        // Iterate through the 2D array
        for (int i = 0; i < values.length; i++) 
        {
            for (int j = 0; j < values[i].length; j++) 
            {
                System.out.print(values[i][j] + " "); // and print the values
            }
            System.out.println();
        }

    }
}