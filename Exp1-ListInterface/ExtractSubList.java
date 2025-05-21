// Q1b-5: Write a Java program for getting different colors through ArrayList interface
// and extract the elements 1st and 2nd from the ArrayList object by using subList()

package list_Operation;
import java.util.*;
public class ExtractSubList {
    public static void main(String[] args){
        // Creating an ArrayList with color elements
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

        // Displaying the original list
        System.out.println("Original List: " + colors);

        // Extracting 1st and 2nd elements (index 0 to 2, exclusive)
        List<String> subColors = colors.subList(0, 2);

        // Displaying the extracted sublist
        System.out.println("Extracted Sublist: " + subColors);
    }
}
