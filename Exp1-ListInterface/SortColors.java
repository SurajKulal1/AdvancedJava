// Q1b-4: Write a java program for getting different colors through ArrayList interface 
// and sort them using Collections.sort(ArrayListObj)
package list_Operation;

import java.util.*;

public class SortColors {
    public static void main(String[] args) {
        // Creating an ArrayList with initial color values
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Yellow", "Red", "Green", "Blue"));

        // Displaying colors before sorting
        System.out.println("Before Sorting: " + colors);

        // Sorting the ArrayList in alphabetical order
        Collections.sort(colors);

        // Displaying colors after sorting
        System.out.println("After Sorting: " + colors);
    }
}
